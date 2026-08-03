package com.hbn.learning.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Transient;
import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
//import lombok.ToString;
import lombok.AllArgsConstructor;



@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Address {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String city, state;
	private int pinCode;
	public Address(String city, String state, int pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}	
}
