package com.asitc.neo4japi.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MqListener {

	// private final CountDownLatch latch = new CountDownLatch(1);
	@Value("${mq.application}")
	private String applicationName;

	private final RestTemplate restTemplate = new RestTemplate();

	// public CountDownLatch getLatch() {
	// return this.latch;
	// }

	@RabbitListener(queues = "api-queue")
	public void receiveMessage(final MqMessage message) {
		System.out.println(message);
		if (this.applicationName != message.getApplication()) {
			final HttpEntity entity = new HttpEntity<>(message.getBody());
			// this.restTemplate.getForObject("/car", responseType);
			// this.restTemplate.exchange("/",
			// HttpMethod.valueOf(message.getMethod()), requestEntity,
			// responseType,
			// uriVariables);
		}
		// this.latch.countDown();
	}
}
