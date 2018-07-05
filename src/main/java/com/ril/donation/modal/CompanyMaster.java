package com.ril.donation.modal;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="DT_CompanyMaster")
@EntityListeners(AuditingEntityListener.class)

public class CompanyMaster 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,length=11,name="ID")
	private int id;
	@Column(name="CompanyCode",nullable=false,length=4)
	private String companyCode;
	@Column(name="CompanyName",nullable=false,length=25)
	private String companyName;
	@Column(name="IsActive",nullable=false,length=1)
	private boolean isActive;
	@Column(name="IsDelete",nullable=false,length=1)
     private boolean isDelete;
	@Column(name="CreatedBy",nullable=false,length=50)
    private String createdBy;
	@Column(name="CreatedOn",nullable=false)
    private Date createdOn;
	@Column(name="UpdatedBy",nullable=false,length=50)
    private String updatedBy;
	@Column(name="UpdatedOn",nullable=false)
    private Date updatedOn;
	@Column(name="Timestamp",nullable=false)
	private Timestamp  timestamp;
	
	
	
	public CompanyMaster() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CompanyMaster(int id, String companyCode, String companyName, boolean isActive, boolean isDelete,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn, Timestamp timestamp) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.isActive = isActive;
		this.isDelete = isDelete;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.timestamp = timestamp;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCompanyCode() {
		return companyCode;
	}



	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public boolean isDelete() {
		return isDelete;
	}



	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}



	public String getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public Date getCreatedOn() {
		return createdOn;
	}



	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}



	public String getUpdatedBy() {
		return updatedBy;
	}



	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}



	public Date getUpdatedOn() {
		return updatedOn;
	}



	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}



	public Timestamp getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

    

	
}
