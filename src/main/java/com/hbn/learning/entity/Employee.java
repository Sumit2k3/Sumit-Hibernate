package com.hbn.learning.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;



@Data
@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor
@ToString(exclude="compName")
@Entity(name = "Employee1")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name, gender;
	private int salary;
	
	@OneToOne
	private Address address;
	
	@Transient
	private String compName;
	
	
	public Employee(String name, String gender, int salary) {
	    this.name = name;
	    this.gender = gender;
	    this.salary = salary;
	}
	
}
