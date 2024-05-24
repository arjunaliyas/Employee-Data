package com.example.employees.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.employees.Entity.EmployeeEntity;
import com.example.employees.Repository.EmployeeRepo;
import com.example.employees.Service.EmployeeService;


@Service
//@CrossOrigin(value = "*")

public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeRepo employeeRepo; 
	
	
	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		return employeeRepo.save(employee);
	}
	

	@Override
	public EmployeeEntity getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
		
	}

	
	
}
