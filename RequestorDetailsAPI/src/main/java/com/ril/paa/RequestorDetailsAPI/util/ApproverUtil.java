package com.ril.paa.RequestorDetailsAPI.util;

import java.util.Date;

import javax.persistence.Column;



public class ApproverUtil {
	
	
	private Long Id;
	
	private String Requestid;
	//@Column(nullable=false)
	private String approverid;
	
	private int status;
	@Column(length=250)
	private String Approvercomments;
	private Date ApprovedDate;
	
	//private Requestor requestor;
	
	public ApproverUtil() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ApproverUtil(Long id, String requestid, String approverid, int status, String approvercomments,
			Date approvedDate) {
		super();
		Id = id;
		Requestid = requestid;
		this.approverid = approverid;
		this.status = status;
		Approvercomments = approvercomments;
		ApprovedDate = approvedDate;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getRequestid() {
		return Requestid;
	}


	public void setRequestid(String requestid) {
		Requestid = requestid;
	}


	public String getApproverid() {
		return approverid;
	}


	public void setApproverid(String approverid) {
		this.approverid = approverid;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getApprovercomments() {
		return Approvercomments;
	}


	public void setApprovercomments(String approvercomments) {
		Approvercomments = approvercomments;
	}


	public Date getApprovedDate() {
		return ApprovedDate;
	}


	public void setApprovedDate(Date approvedDate) {
		ApprovedDate = approvedDate;
	}
	
	
	

	

}
