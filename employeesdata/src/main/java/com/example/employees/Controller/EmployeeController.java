package com.example.employees.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.Entity.EmployeeEntity;
import com.example.employees.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "*") 
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<EmployeeEntity> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/saveEmployee")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public EmployeeEntity updateEmployee(@PathVariable Long id,@RequestBody EmployeeEntity employee) {
		employee.setId(id);
		return employeeService.saveEmployee(employee);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		
	}

}
