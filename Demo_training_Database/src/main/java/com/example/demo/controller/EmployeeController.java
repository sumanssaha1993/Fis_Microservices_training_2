package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeService.get(id);
	}

	@PostMapping
	public void createEmployee(@RequestBody Employee employee) throws Exception {

		employeeService.add(employee);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeService.remove(id);
	}
	
	@PostMapping("/update")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
	}
}
