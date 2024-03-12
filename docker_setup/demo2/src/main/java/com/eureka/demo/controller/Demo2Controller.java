package com.eureka.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	@GetMapping
	public String getDemo2() {
		return "hello from demo2**";
	}
	
	@GetMapping("/rest2")
	public String rest2() {
		return "just ordinary serivce nothing fancy";
	}
	
	
}
