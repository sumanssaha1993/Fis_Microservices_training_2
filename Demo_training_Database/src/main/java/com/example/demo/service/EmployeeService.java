package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee get(Integer empId) {

		Optional<Employee> emp = employeeRepository.findById(empId);
		return emp.isPresent() ? emp.get() : null;
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Integer add(Employee employee) {

		employeeRepository.save(employee);

		return employee.getId();
	}
	
	public void remove(Integer empId) {
		employeeRepository.deleteById(empId);
	}
	
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}
}
