package com.learning.spring.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@Import (DemoConfiguration.class)//If this class is not annotated with @Configuration then Import is required.
public class SpringMicroservicesApplication {

	@Autowired
	private List<String> circusAnimals;
	
	@RequestMapping ("/")
	public String message () {
		return circusAnimals.toString();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesApplication.class, args);
	}
}
