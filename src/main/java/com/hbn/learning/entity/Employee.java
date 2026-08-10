package com.hbn.learning.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;



@Data
@RequiredArgsConstructor
@ToString(exclude ="address")
@Entity(name = "Employee1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name, gender;
	private int salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Address> address;
	
	
	public Employee(String name, String gender, int salary) {
	    this.name = name;
	    this.gender = gender;
	    this.salary = salary;
	}	
}
