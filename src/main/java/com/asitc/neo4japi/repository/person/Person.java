package com.asitc.neo4japi.repository.person;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import com.asitc.neo4japi.repository.person.relationship.Ownership;

public class Person {

	@Property(name = "first_name")
	private String firstName;
	@Id
	@GeneratedValue
	private Long id;
	@Property(name = "last_name")
	private String lastName;
	@Relationship(type = "IS_OWNER", direction = Relationship.OUTGOING)
	private Iterable<Ownership> vehicles;

	public String getFirstName() {
		return this.firstName;
	}

	public Long getId() {
		return this.id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Iterable<Ownership> getVehicles() {
		return this.vehicles;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setVehicles(final Iterable<Ownership> vehicles) {
		this.vehicles = vehicles;
	}

}
