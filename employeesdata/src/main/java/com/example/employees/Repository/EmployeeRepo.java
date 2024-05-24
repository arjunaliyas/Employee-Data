package com.example.employees.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employees.Entity.EmployeeEntity;
import java.util.List;



@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {
	

}
