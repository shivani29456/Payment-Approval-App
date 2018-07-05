package com.ril.donation.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ril.donation.modal.CompanyMaster;
import com.ril.donation.repository.CompanyMasterRepository;
import com.ril.donation.util.CompanyMasterUtil;
import com.ril.donation.util.DeleteCompanyMasters;



@RestController
public class CompanyMasterController
{
	@Autowired
	CompanyMasterRepository  companyMasterRepository;
	
	
	@RequestMapping(value="viewCompanyMasters" ,method=RequestMethod.GET)
	   public ResponseEntity<Object> viewCompanyMasters() {
		HashMap<String,Object> responseObject=new HashMap<String,Object>();
		List<CompanyMaster> list=companyMasterRepository.findAll();
		responseObject.put("data", list);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	   }
	
	@RequestMapping(value="viewByIdCompanyMaster" ,method=RequestMethod.POST)
	 public ResponseEntity<Object> viewCompanyMaster(@Valid @RequestBody CompanyMasterUtil companyMasterUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		java.util.Optional<CompanyMaster> cmp=companyMasterRepository.findById(companyMasterUtil.getId());
		responseObject.put("data", cmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	   }	
	
	@RequestMapping(value="saveCompanyMaster" ,method=RequestMethod.POST)
	public ResponseEntity<Object> saveCompanyMaster(@Valid @RequestBody CompanyMaster cmp)
	{
		HashMap<String,Object> responseObject=new HashMap<>();
		companyMasterRepository.save(cmp);
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);

		
	}

	@RequestMapping(value="deleteCompanyMaster" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMaster(  @Valid @RequestBody CompanyMasterUtil companyMasterUtil) {
		HashMap<String,Object> responseObject=new HashMap<>();
		companyMasterRepository.deleteById(companyMasterUtil.getId());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	@RequestMapping(value="deleteCompaniesMasters" ,method=RequestMethod.POST)
    public ResponseEntity<Object> deleteCompanyMasters(  @Valid @RequestBody DeleteCompanyMasters deleteCompanyMasters) {
		HashMap<String,Object> responseObject=new HashMap<>();
		companyMasterRepository.deleteByIdIn(deleteCompanyMasters.getCompanyMasterIds());
		responseObject.put("message", "success");
		return new ResponseEntity<>(responseObject, HttpStatus.OK);
	}
	
	
	

}
