package com.fullstack.services;

import java.util.List;

import com.fullstack.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee) ;

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Long id);

}
