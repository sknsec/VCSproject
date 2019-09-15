package com.accenture.VCS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "participant_db")
public class ParticipantEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PARTICIPANT_ID")//,unique = true, nullable = false)
	private long participantId;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 40)
	@NotNull
	private String firstName;
	
	@Column(name = "LAST_NAME", nullable = false, length = 40)
	@NotNull
	private String lastName;
	
	@Column(name = "TITLE", nullable = false, length = 5)
	@NotNull
	private String title;
	
	@Column(name = "DATE_OF_BIRTH", nullable = false)
	@NotNull
	private Date dateOfBirth;
	
	@Column(name = "PHONE_NUMBER",unique = true, nullable = false, length = 10)
	@NotNull
	private long phoneNumber;
	
	@Column(name = "EMAIL_ID",unique = true, nullable = false, length = 40)
	@NotNull
	private String emailId;
	
	@Column(name = "SSN",unique = true, nullable = false, length = 10)
	@NotNull
	private int ssn;
	
	@Column(name = "ADDRESS",length = 255)
	private String address;
	
	@Column(name = "PINCODE", length = 6)
	private int pincode;
	
	@Column(name = "STATE_CODE", length = 2)
	private int stateCode;

	public long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(long participantId) {
		this.participantId = participantId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	

}
