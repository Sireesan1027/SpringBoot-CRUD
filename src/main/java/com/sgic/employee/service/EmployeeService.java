package com.sgic.employee.service;

import java.util.List;

import com.sgic.employee.entities.Employee;

public interface EmployeeService {
	 void saveEmployee(Employee employee);
	 public List<Employee> getAllEmployee();
	 public void deleteEmployee(long id);

}
