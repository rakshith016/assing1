package com.example.Assingment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Assingment1.dto.EmployeeDTO;
import com.example.Assingment1.model.Employee;
import com.example.Assingment1.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDTO employee) {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.addEMployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(employee2, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDTO employee) {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.UpdateEMployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(employee2, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Long empId) throws Exception {

		this.employeeService.DeleteEMployee(empId);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@GetMapping("/employee/get/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") Long empId) throws Exception {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.FindEMployeeById(empId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(employee2, HttpStatus.OK);
	}
	
	@GetMapping("/employee/get")
	public ResponseEntity<?> getEmployeeById() throws Exception {

		List<Employee> employee2 = null;
		try {
			employee2 = this.employeeService.FindEMployeeB();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(employee2, HttpStatus.OK);
		
	}
}
