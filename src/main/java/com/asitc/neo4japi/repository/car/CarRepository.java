package com.asitc.neo4japi.repository.car;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "car", path = "car")
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {

	List<Car> findByMake(@Param("make") String make);

	@Query("MATCH (c:Car)<-[:IS_OWNER]-(p:Person) WHERE ID(p) = {person_id} RETURN c")
	List<Car> findByOwner(@Param("person_id") Integer personId);

}
