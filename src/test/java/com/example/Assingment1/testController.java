package com.example.Assingment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.Assingment1.controller.EmployeeController;
import com.example.Assingment1.dto.EmployeeDTO;
import com.example.Assingment1.model.Employee;
import com.example.Assingment1.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class testController {

	@Mock
	EmployeeService employeeService;

	@InjectMocks
	EmployeeController employeeController;

	private MockMvc mockMvc;

	@Test
	void testcreateEmployeeDetails() throws Exception {
		Employee entity1 = new Employee();
		EmployeeDTO entity = new EmployeeDTO();
		entity.setId(100L);
		entity.setName("sachin");
		entity.setAge(25L);
		when(employeeService.addEmployee(entity)).thenReturn(entity1);
		assertEquals(entity1, employeeController.addEmployee(entity));
	}

	@Test
	void testsearchEmployeeDetails() throws Exception {
		Employee entity = new Employee();
		when(employeeService.findEmployeeById(100L)).thenReturn(entity);
		assertEquals(entity, employeeController.getEmployeeById(100L));

	}

	@Test
	void deleteEmployeeDetails() throws Exception {
		Employee entity = new Employee();
		entity.setId(100L);
//        
		assertEquals(true, employeeController.deleteEmployeeById(100L));

	}

}
