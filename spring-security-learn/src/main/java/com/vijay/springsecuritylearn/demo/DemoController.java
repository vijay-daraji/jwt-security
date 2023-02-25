package com.vijay.springsecuritylearn.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/demo-controller")
public class DemoController {
	
	@GetMapping("/api/v1/demo-controller")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello from secureed endpoint");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("Welcome");
	}

}
