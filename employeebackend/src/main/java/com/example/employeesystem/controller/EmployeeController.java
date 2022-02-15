package com.example.employeesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesystem.model.Employee;
import com.example.employeesystem.repository.EmployeeRepository;


@RestController
@RequestMapping("api/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping("/all")
	public List<Employee> getAllEmployee()
	{
		return employeeRepo.findAll();
	}
	
//	@PostMapping("/username")
//	public List<Employee> getAllEmployee()
//	{
//		return employeeRepo.findAll();
//	}
}



