package com.sgic.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
