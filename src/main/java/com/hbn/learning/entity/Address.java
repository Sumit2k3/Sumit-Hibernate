package com.hbn.learning.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(exclude ="employee")
@Entity
public class Address {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String city, state;
	private int pinCode;
	
	@ManyToMany(mappedBy ="address")
	private List<Employee> employee;
		
	
	public Address(String city, String state, int pinCode) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}	
}
