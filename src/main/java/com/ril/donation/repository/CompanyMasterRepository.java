package com.ril.donation.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ril.donation.modal.CompanyMaster;



@Repository
public interface CompanyMasterRepository extends JpaRepository<CompanyMaster, Integer> {
	@Transactional
	public void deleteByIdIn(List<Integer> companyMasterIds);

}
