package com.ril.paa.RequestorDetailsAPI.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.ril.paa.RequestorDetailsAPI.modal.Requestor;
import com.ril.paa.RequestorDetailsAPI.repository.RequestorRepository;
@Service
public class RequestorDao {
	
	@Autowired 
	RequestorRepository requestorRepository;
	
	
	
	
	public Requestor save(Requestor req)
	{
		return requestorRepository.save(req);
	}
	
	
	
	public List<Requestor> findAll() {
		return  requestorRepository.findAll();
	}
	
	

}
