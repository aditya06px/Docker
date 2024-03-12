package com.eureka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo3")
public class Demo3Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String getDemo3() {
		return "hello from demo3////";
	}
	
	@GetMapping("/rest3") 
	public String rest1() {

        // URL of Service 2 endpoint
        String service2Url = "http://localhost:9002/demo2/rest2";

        // Make a GET request to Service 2
        String response = restTemplate.getForObject(service2Url, String.class);

        // Process the response from Service 2
        System.out.println("Response from Service 2: " + response);
        
        return "service demo3 called service 2 and response is " + response;
	}
	
}
