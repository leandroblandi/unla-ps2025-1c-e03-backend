package com.unla.airbnb.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping
	public ResponseEntity<String> test() {
		String response = "Hola, funcionando";
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
