package com.asitc.neo4japi.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

	@Autowired
	private MqSender mqSender;

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		this.mqSender.sendMessage();
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
