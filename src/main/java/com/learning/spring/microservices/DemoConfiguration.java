package com.learning.spring.microservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class DemoConfiguration {
	
	@Bean
	public List<String> circus () {
		List<String> animals = new ArrayList<>();
		animals.add("Tiger");
		animals.add("lion");
		
		return animals;
	}
	
	@Bean
	public DispatcherServlet dispatcherServlet () {
		return new DispatcherServlet();
	}
	
	@Bean
	//After this tag URL to access the app - http://localhost:8080/demo/servlet/
	public ServletRegistrationBean<DispatcherServlet> registration () {
		ServletRegistrationBean<DispatcherServlet> registration = new ServletRegistrationBean<>(
				dispatcherServlet (), "/servlet/*");//This URL mapping is for all the requests
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME);
		
		return registration;
	}
}
