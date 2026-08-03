package com.hbn.learning.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@RequiredArgsConstructor
@Entity(name = "Employee1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name, gender;
	private int salary;
	
	@OneToOne
	@JoinColumn(name ="add_id")
	private Address address;
	
	
	public Employee(String name, String gender, int salary) {
	    this.name = name;
	    this.gender = gender;
	    this.salary = salary;
	}	
}
