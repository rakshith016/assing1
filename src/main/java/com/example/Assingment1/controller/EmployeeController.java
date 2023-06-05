package com.example.Assingment1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assingment1.dto.EmployeeDTO;

@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public ResponseEntity<?> getHiString() {
	
		
	return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
}
