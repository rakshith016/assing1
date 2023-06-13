package com.example.Assingment1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Assingment1.dto.EmployeeDTO;
import com.example.Assingment1.model.Employee;


@Service
public interface EmployeeService {

	/**
	 * To Add a Employee
	 * @param employeeDTO
	 * @return
	 * @throws Exception
	 */
	public Employee addEMployee(EmployeeDTO employeeDTO) throws Exception;
	
	/**
	 * TO Update Employee Details
	 * @param employeeDTO
	 * @return
	 * @throws Exception
	 */
	public Employee UpdateEMployee(EmployeeDTO employeeDTO) throws Exception;
	
	/**
	 * To Delete Employee Details
	 * @param empID
	 * @return
	 * @throws Exception
	 */
	public Boolean DeleteEMployee(Long empID) throws Exception;

	/**
	 * To Find EMployee by Id
	 * @param empID
	 * @return
	 * @throws Exception
	 */
	public Employee FindEMployeeById(Long empID) throws Exception;

	/**
	 * To Find All employee
	 * @return
	 * @throws Exception
	 */
	public List<Employee> FindEMployeeB() throws Exception;

}
