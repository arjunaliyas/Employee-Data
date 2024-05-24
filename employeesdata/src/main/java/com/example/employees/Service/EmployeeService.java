package com.example.employees.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.employees.Entity.EmployeeEntity;


@Service
public interface EmployeeService {
	
	List<EmployeeEntity> getAllEmployees();
	
	EmployeeEntity getEmployeeById(Long id);
	
	EmployeeEntity saveEmployee(EmployeeEntity employee);
	
	void deleteEmployee(Long id);

}
