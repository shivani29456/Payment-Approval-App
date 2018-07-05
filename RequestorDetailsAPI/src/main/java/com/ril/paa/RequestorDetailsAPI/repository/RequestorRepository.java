package com.ril.paa.RequestorDetailsAPI.repository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import com.ril.paa.RequestorDetailsAPI.modal.Requestor;



@Repository
public interface RequestorRepository extends JpaRepository<Requestor, Long> {
 
}