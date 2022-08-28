package com.jcunsupervised.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringApplication.class, args);
	}

	CommandLineRunner commandLineRunner( KafkaTemplate<String,String>  kafkaTemplate){
		return args -> {
			kafkaTemplate.send("kafka-topic", "hello world");
		};
	}


}
