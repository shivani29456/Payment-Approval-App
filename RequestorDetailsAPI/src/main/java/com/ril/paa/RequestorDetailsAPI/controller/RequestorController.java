 package com.ril.paa.RequestorDetailsAPI.controller;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.Map;
import com.netflix.appinfo.InstanceInfo;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.ril.paa.RequestorDetailsAPI.dao.RequestorDao;
import com.ril.paa.RequestorDetailsAPI.modal.Requestor;
import com.ril.paa.RequestorDetailsAPI.repository.RequestorRepository;
import com.ril.paa.RequestorDetailsAPI.util.ApproverUtil;

//import ch.qos.logback.classic.Logger;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController

//@RequestMapping("/api")

public class RequestorController {
	
	//public static final Logger logger = LoggerFactory.getLogger(StudentResource.class);
	 

	@Autowired
	 private RequestorDao requestorDao;

	@Autowired
    private RestTemplate restTemplate;
 
    @Autowired

    private LoadBalancerClient loadBalancerClient;

    private String approverServiceId="Approver-service";

    

	
	@PostMapping(value="/insert")
	

	public ResponseEntity<Requestor> createRequestor(@Valid @RequestBody Requestor req)
	{
		Requestor requestor= requestorDao.save(req);
						 
		    MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
	        Map map = new HashMap<String, String>();
	        map.put("Content-Type", "application/json");

	        headers.setAll(map);

	        Map req_payload = new HashMap();
	        req_payload.put("status", 0);

	        HttpEntity<?> request = new HttpEntity<>(req_payload, headers);
	        //Application
	        ServiceInstance serviceInstance = loadBalancerClient.choose(approverServiceId);
	        //InstanceInfo instanceInfo = serviceInstance.getInstances().get(0);

	        //String url="http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/" + "add/details";
	        String url=serviceInstance.getUri().toString();
	        url=url + "add/details";
	        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
	        System.out.println(response.getBody());	       		
		    return ResponseEntity.ok().body(requestor);
		
	}

	@GetMapping(value ="/test1")

	public List<Requestor> getAllRequestors() {
		return requestorDao.findAll();
	}
}

	