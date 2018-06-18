package com.asitc.neo4japi.repository.person;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public class Person {

	private String firstName;
	@Id
	@GeneratedValue
	private Long id;
	private String lastName;

	public String getFirstName() {
		return this.firstName;
	}

	public Long getId() {
		return this.id;
	}

	public String getLastName() {
		return this.lastName;
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

}
