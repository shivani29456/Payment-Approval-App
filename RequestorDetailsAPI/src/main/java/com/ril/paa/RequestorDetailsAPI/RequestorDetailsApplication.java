package com.ril.paa.RequestorDetailsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*
@ComponentScan({"com.ril.paa.RequestorDetailsAPI.controller","com.ril.paa.RequestorDetailsAPI.dao"})
@EntityScan(basePackages="com.ril.paa.RequestorDetailsAPI.modal",basePackageClasses= {Requestor.class})
@EnableJpaRepositories("com.ril.paa.RequestorDetailsAPI.repository")*/
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class RequestorDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestorDetailsApplication.class, args);
	}
	
	
	 @Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }
}
