package com.asitc.neo4japi.relationship;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.asitc.neo4japi.repository.car.Car;
import com.asitc.neo4japi.repository.person.Person;

@RelationshipEntity(type = "IS_OWNER")
public class Ownership {

	@Property(name = "acquisition_date")
	private Date acquisitionDate;
	@EndNode
	private Car car;
	@StartNode
	private Person person;
	@Id
	@GeneratedValue
	private Long relationshipId;

}