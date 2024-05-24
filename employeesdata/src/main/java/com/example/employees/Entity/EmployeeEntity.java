package com.example.employees.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "employees",name="data")
public class EmployeeEntity {
	
	@Id
	@Column(name ="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String image;
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private int age;
	
	@Column(name="department")
	private String department;
	
	@Column(name="job")
	private String job;
	
	@Column(name="country")
	private String country;
	
	@Column(name="number")
	private String mobileNo;

}
