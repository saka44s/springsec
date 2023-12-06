package com.myproj.springsec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String test() {
		return "Hi, Its me";
	}
	
	@GetMapping("/admin")
	public String testAdmin() {
		return "Hi, Its me";
	}
	
	@GetMapping("/user")
	public String testUser() {
		return "Hi, Its me";
	}
	
}
