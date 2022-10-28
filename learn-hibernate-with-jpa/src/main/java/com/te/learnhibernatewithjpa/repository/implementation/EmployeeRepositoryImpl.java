package com.te.learnhibernatewithjpa.repository.implementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.learnhibernatewithjpa.entity.Employee;
import com.te.learnhibernatewithjpa.repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Integer saveEmployee(Employee employee) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		return employee.getEmpId();
	}

	@Override
	public Employee readEmployee(Integer empId) {
		return entityManager.getReference(Employee.class, empId);
	}

	@Override
	public void updateEmployee(Integer empId, Employee employee) {
		// READ + PERSIST

		// READ
		Employee empFromDB = entityManager.find(Employee.class, empId);
		if (employee.getEmpAge() != null) {
			empFromDB.setEmpAge(employee.getEmpAge());
		}
		if (employee.getEmpName() != null) {
			empFromDB.setEmpName(employee.getEmpName());
		}
		if (employee.getEmpSalary() != null) {
			empFromDB.setEmpSalary(employee.getEmpSalary());
		}

		// PERSIST
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(empFromDB);
		transaction.commit();
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// READ + REMOVE

		// READ
		Employee empFromDB = entityManager.find(Employee.class, empId);

		// REMOVE
		if (empFromDB != null) {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.remove(empFromDB);
			transaction.commit();
		}
	}

}
