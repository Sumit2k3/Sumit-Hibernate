package com.hbn.learning.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;



@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(exclude="employee")
@Entity
public class Address {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String city, state;
	private int pinCode;
	
	@OneToOne(mappedBy ="address")
	private Employee employee;
	
	public Address(String city, String state, int pinCode) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}	
}
