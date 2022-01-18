package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Department department = new Department("Software Development");
		departmentRepository.save(department);

		Employee ross = new Employee("Ross", "Napier", "ross-napier@hotmail.com", department);
		employeeRepository.save(ross);
	}

}
