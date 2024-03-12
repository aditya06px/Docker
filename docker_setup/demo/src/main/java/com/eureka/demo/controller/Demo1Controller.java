package com.eureka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo1")
public class Demo1Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String getDemo1() {
		return "hello from demo1";
	}
	
	@GetMapping("/rest1") 
	public String rest1() {
		
		String response = "";
		
		try {

        // URL of Service 2 endpoint
        String service2Url = "http://localhost:9002/demo2/rest2";

        // Make a GET request to Service 2
		response = restTemplate.getForObject(service2Url, String.class);

        // Process the response from Service 2
        System.out.println("Response from Service 2: " + response);
		
		}catch(Exception e) {
			return "exceptionnnnnnnnnnnnn " + e.getMessage();
		}
		
		return "service demo1 callled service 2 and response is " + response;
		
	}
	
}
