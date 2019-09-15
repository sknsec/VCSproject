package com.accenture.VCS.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;



@Entity
@Table(name = "claim_db")
public class ClaimEntity {
	
	
	
/*	public ClaimEntity(ClaimRequest rq) {
		
		this.claimId = rq.getClaimId();
		this.dateOfloss = rq.getDateOfloss();
		this.timeOfloss = rq.getTimeOfloss();
		this.losslocationAddress = rq.getLosslocationAddress();
		this.pincode = rq.getPincode();
		this.lossLocationStateCode = rq.getLossLocationStateCode();
		this.injuryDetail = rq.getInjuryDetail();
		this.policyNumber = rq.getPolicyNumber();
		this.descriptionOfLos = rq.getDescriptionOfLos();
	}*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "claim_Id")//,unique = true, nullable = false)
	private int claimId;
	@Column(name = "date_Of_loss", nullable = false, length = 20)
	@NotNull
	private String dateOfloss;
	@Column(name = "time_Of_loss", nullable = false, length = 20)
	@NotNull
	private String timeOfloss;
	@Column(name = "loss_location_Address",  length = 20)
	@NotNull
	private String losslocationAddress;
	@Column(name = "pincode", nullable = false, length = 20)
	@NotNull
	private String pincode;
	@Column(name = "loss_Location_State_Code", nullable = false, length = 20)
	@NotNull
	private String lossLocationStateCode;
	@Column(name = "injury_Detail", nullable = false, length = 20)
	@NotNull
	private String injuryDetail;
	@Column(name = "policy_Number", nullable = false, length = 20)
	@NotNull
	private int policyNumber;
	@Column(name = "description_Of_Los", nullable = false, length = 20)
	@NotNull
	private String descriptionOfLos;
	
	
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public String getDateOfloss() {
		return dateOfloss;
	}
	public void setDateOfloss(String dateOfloss) {
		this.dateOfloss = dateOfloss;
	}
	public String getTimeOfloss() {
		return timeOfloss;
	}
	public void setTimeOfloss(String timeOfloss) {
		this.timeOfloss = timeOfloss;
	}
	public String getLosslocationAddress() {
		return losslocationAddress;
	}
	public void setLosslocationAddress(String losslocationAddress) {
		this.losslocationAddress = losslocationAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLossLocationStateCode() {
		return lossLocationStateCode;
	}
	public void setLossLocationStateCode(String lossLocationStateCode) {
		this.lossLocationStateCode = lossLocationStateCode;
	}
	public String getInjuryDetail() {
		return injuryDetail;
	}
	public void setInjuryDetail(String injuryDetail) {
		this.injuryDetail = injuryDetail;
	}
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getDescriptionOfLos() {
		return descriptionOfLos;
	}
	public void setDescriptionOfLos(String descriptionOfLos) {
		this.descriptionOfLos = descriptionOfLos;
	}
	
	
	
          

}
