package com.example.Assingment1.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Assingment1.dto.EmployeeDTO;
import com.example.Assingment1.model.Employee;
import com.example.Assingment1.repo.EmpRepo;
import com.example.Assingment1.service.EmployeeService;

@Component
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmpRepo empRepo;

	@Override
	public Employee addEmployee(EmployeeDTO employeeDTO) throws Exception {
		Employee employee = new Employee();
		employee.setName(employeeDTO.getName());
		employee.setAge(employeeDTO.getAge());

		employee = this.empRepo.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(EmployeeDTO employeeDTO) throws Exception {

		Employee employee = this.empRepo.findById(employeeDTO.getId()).get();

		if (employee != null) {
			employee.setId(employeeDTO.getId());
			employee.setName(employeeDTO.getName());
			employee.setAge(employeeDTO.getAge());

			employee = this.empRepo.save(employee);
		} else {
			throw new Exception("Employee not Found");
		}
		return employee;
	}

	@Override
	public Boolean deleteEmployee(Long empID) throws Exception {
		Employee employee = this.empRepo.findById(empID).get();

		if (employee != null) {
			this.empRepo.deleteById(empID);
		} else {
			throw new Exception("Employee not Found");
		}
		return true;
	}

	@Override
	public Employee findEmployeeById(Long empID) throws Exception {

		Employee employee = this.empRepo.findById(empID).get();


		return employee;
	}

	@Override
	public List<Employee> findEmployeeB() throws Exception {
		List<Employee> employee = this.empRepo.findAll();
		return employee;
	}

}
