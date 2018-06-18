package com.asitc.neo4japi.repository.car;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
// @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Car {

	@Id
	@GeneratedValue
	private Long id;
	private String make;
	private String model;
	// @JsonProperty("registration_number")
	private String registrationNumber;
	private Integer year;

	public Long getId() {
		return this.id;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	public void setModel(final String model) {
		this.model = model;
	}

	public void setRegistrationNumber(final String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setYear(final Integer year) {
		this.year = year;
	}

}
