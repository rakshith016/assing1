package com.example.Assingment1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Assingment1.dto.EmployeeDTO;
import com.example.Assingment1.model.Employee;
import com.example.Assingment1.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody EmployeeDTO employee) {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.addEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee2;
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDTO employee) {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.updateEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(employee2, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public Boolean deleteEmployeeById(@PathVariable("id") Long empId) throws Exception {

		this.employeeService.deleteEmployee(empId);
		return true;
	}
	
	@GetMapping("/employee/get/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long empId) throws Exception {

		Employee employee2 = null;
		try {
			employee2 = this.employeeService.findEmployeeById(empId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee2;
	}
	
	@GetMapping("/employee/get")
	public List<Employee> getEmployeeById() throws Exception {

		List<Employee> employee2 = null;
		try {
			employee2 = this.employeeService.findEmployeeB();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee2;
		
	}
}
