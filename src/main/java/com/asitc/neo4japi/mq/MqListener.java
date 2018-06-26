package com.asitc.neo4japi.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.asitc.neo4japi.repository.car.Car;
import com.asitc.neo4japi.repository.car.CarRepository;
import com.asitc.neo4japi.repository.person.PersonRepository;

@Component
public class MqListener {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private PersonRepository personRepository;

	@Value("${mq.application}")
	private String applicationName;

	@RabbitListener(queues = "mongodb.queue")
	public void receiveMessage(final MqMessage message) {
		System.out.println(message);
		final Iterable<Car> cars = this.carRepository.findAll();
		System.out.println(cars.spliterator().getExactSizeIfKnown());
		if (this.applicationName != message.getApplication()) {
		}
	}
}
