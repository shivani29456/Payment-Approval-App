package com.ril.paa.RequestorDetailsAPI.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name="requestorData")
@EntityListeners(AuditingEntityListener.class)
public class Requestor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,length=11)
	private Long requestId;
	@Column(length=20)
	private String requestNumber;
	@Column(nullable=false)
	private Date paymentDate;
	@Column(nullable=false,length=11)
	private int paymentAmt;
	@Column(nullable=false,length=25)
	private String recipientName;
	@Column(length=250)
	private String recipientSAPCode;
	@Column(nullable=false,length=250)
	private String purposeOfExpense;
	@Column(nullable=false,length=50)
	private String sendorCompanyName;
	@Column(length=250)
	private String requestorComment;
	@Column(length=50)
	private String createdby;
	
	private Date createdon;
	
	
	public Requestor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Requestor(Long requestId, String requestNumber, Date paymentDate, int paymentAmt, String recipientName,
			String recipientSAPCode, String purposeOfExpense, String sendorCompanyName, String requestorComment,
			String createdby, Date createdon) {
		super();
		this.requestId = requestId;
		this.requestNumber = requestNumber;
		this.paymentDate = paymentDate;
		this.paymentAmt = paymentAmt;
		this.recipientName = recipientName;
		this.recipientSAPCode = recipientSAPCode;
		this.purposeOfExpense = purposeOfExpense;
		this.sendorCompanyName = sendorCompanyName;
		this.requestorComment = requestorComment;
		this.createdby = createdby;
		this.createdon = createdon;
	}



	public Long getRequestId() {
		return requestId;
	}


	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}


	public String getRequestNumber() {
		return requestNumber;
	}


	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public int getPaymentAmt() {
		return paymentAmt;
	}


	public void setPaymentAmt(int paymentAmt) {
		this.paymentAmt = paymentAmt;
	}


	public String getRecipientName() {
		return recipientName;
	}


	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}


	public String getRecipientSAPCode() {
		return recipientSAPCode;
	}


	public void setRecipientSAPCode(String recipientSAPCode) {
		this.recipientSAPCode = recipientSAPCode;
	}


	public String getPurposeOfExpense() {
		return purposeOfExpense;
	}


	public void setPurposeOfExpense(String purposeOfExpense) {
		this.purposeOfExpense = purposeOfExpense;
	}


	public String getSendorCompanyName() {
		return sendorCompanyName;
	}


	public void setSendorCompanyName(String sendorCompanyName) {
		this.sendorCompanyName = sendorCompanyName;
	}


	public String getRequestorComment() {
		return requestorComment;
	}


	public void setRequestorComment(String requestorComment) {
		this.requestorComment = requestorComment;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public Date getCreatedon() {
		return createdon;
	}


	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	

	
}