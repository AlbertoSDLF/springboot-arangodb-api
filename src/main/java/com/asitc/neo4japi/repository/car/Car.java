package com.asitc.neo4japi.repository.car;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import com.asitc.neo4japi.repository.person.relationship.Ownership;

@NodeEntity
// @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Car {

	@Id
	@GeneratedValue
	private Long id;
	private String make;
	private String model;
	@Relationship(type = "IS_OWNER", direction = Relationship.INCOMING)
	private Ownership owner;
	// @JsonProperty("registration_number")
	@Property(name = "registration_number")
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

	public Ownership getOwner() {
		return this.owner;
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

	public void setOwner(final Ownership owner) {
		this.owner = owner;
	}

	public void setRegistrationNumber(final String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setYear(final Integer year) {
		this.year = year;
	}

}
