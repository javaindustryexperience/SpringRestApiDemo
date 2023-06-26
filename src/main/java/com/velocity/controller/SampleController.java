package com.velocity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/getTest")
	public String getDemo() {
		return "Spring Boot Rest API Example";
	}
}
