package com.te.learnhibernatewithjpa;

import com.te.learnhibernatewithjpa.repository.EmployeeRepository;
import com.te.learnhibernatewithjpa.repository.implementation.EmployeeRepositoryImpl;

public class DeleteEmployee {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		employeeRepository.deleteEmployee(300);
		
	}
}
