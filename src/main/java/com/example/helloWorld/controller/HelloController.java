package com.example.helloWorld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hello world",HttpStatus.OK);
	}
}
