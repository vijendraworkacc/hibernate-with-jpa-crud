package com.te.learnhibernatewithjpa;

import com.te.learnhibernatewithjpa.entity.Employee;
import com.te.learnhibernatewithjpa.repository.EmployeeRepository;
import com.te.learnhibernatewithjpa.repository.implementation.EmployeeRepositoryImpl;

public class UpdateEmployee {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		employeeRepository.updateEmployee(4, 
			Employee.builder().empAge(29).empName("CV").build()
		);
	}
}
