package com.accenture.VCS.model;

import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "vehicle_db")
public class VehicleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEHICLE_ID")//,unique = true, nullable = false)
	private long vehicleId;

	@Column(name = "MAKE", nullable = false, length = 10)
	@NotNull
	private String make;

	@Column(name = "MODEL", nullable = false, length = 10)
	@NotNull
	private String model;

	@Column(name = "YEAR", nullable = false)
	@NotNull
	private Year year;

	@Column(name = "COLOR", length = 20)
	private String color;

	@Column(name = "PLATE_NUMBER", unique = true, nullable = false, length = 15)
	@NotNull
	private String plateNumber;

	@Column(name = "VIN", unique = true, nullable = false, length = 20)
	@NotNull
	private String vin;

	@Column(name = "REGISTRATION_STATECODE", length = 2)
	private int registrationStatecode;

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getRegistrationStatecode() {
		return registrationStatecode;
	}

	public void setRegistrationStatecode(int registrationStatecode) {
		this.registrationStatecode = registrationStatecode;
	}



}
