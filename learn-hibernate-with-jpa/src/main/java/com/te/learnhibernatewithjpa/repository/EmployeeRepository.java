package com.te.learnhibernatewithjpa.repository;

import com.te.learnhibernatewithjpa.entity.Employee;

public interface EmployeeRepository {
	public abstract Integer saveEmployee(Employee employee);
	public abstract Employee readEmployee(Integer empId);
	public abstract void updateEmployee(Integer empId, Employee employee);
	public abstract void deleteEmployee(Integer empId);
}
