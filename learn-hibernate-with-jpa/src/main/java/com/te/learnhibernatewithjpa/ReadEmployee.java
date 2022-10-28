package com.te.learnhibernatewithjpa;

import com.te.learnhibernatewithjpa.entity.Employee;
import com.te.learnhibernatewithjpa.repository.EmployeeRepository;
import com.te.learnhibernatewithjpa.repository.implementation.EmployeeRepositoryImpl;

public class ReadEmployee {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		Employee employee = employeeRepository.readEmployee(3);
		System.out.println(employee);
		
	}
}
