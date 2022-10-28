package com.te.learnhibernatewithjpa;

import com.te.learnhibernatewithjpa.entity.Employee;
import com.te.learnhibernatewithjpa.repository.EmployeeRepository;
import com.te.learnhibernatewithjpa.repository.implementation.EmployeeRepositoryImpl;

public class SaveEmployee {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		
		Employee employee = new Employee()
				.builder()
					.empAge(22)
					.empName("BQ")
					.empSalary(25000.98D)
				.build();
		System.out.println(employeeRepository.saveEmployee(employee));
		
		
	}
}
