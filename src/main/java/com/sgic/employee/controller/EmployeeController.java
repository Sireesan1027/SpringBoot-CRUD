package com.sgic.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.employee.entities.Employee;
import com.sgic.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<Object> createIncomingSample(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@GetMapping(value="/employee")
	public ResponseEntity<Object> getAllEmployee()
	{
		List<Employee> employeeList=employeeService.getAllEmployee();
		return new ResponseEntity<Object>(employeeList,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/employee/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable long id)
	{
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@PutMapping(value="/employee")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return new ResponseEntity<Object>(employee,HttpStatus.OK);
	}
	
	@GetMapping(value="/Get")
	public String get()
	{
		return "Hello World";
	}
	
	@RequestMapping("/hello")
	public Map<String, String> callAsyncMethod() {
		Map map = new HashMap<Integer, String>();
		map.put("message", "Hello");

		return map; // returns empty braces
	}
}
