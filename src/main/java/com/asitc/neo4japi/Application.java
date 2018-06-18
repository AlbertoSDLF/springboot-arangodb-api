
package com.asitc.neo4japi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
// @Configuration
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// @Bean
	// public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
	// return new
	// Jackson2ObjectMapperBuilder().propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	// }

}
