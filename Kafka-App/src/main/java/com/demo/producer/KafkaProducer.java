package com.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.constant.ApplicationConstant;

@RestController
@RequestMapping("/produce")

public class KafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@GetMapping("/{message}")
	public String sendMessage(@PathVariable String message) {

		try {
			kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Message sent succuessfully";
	}

}
