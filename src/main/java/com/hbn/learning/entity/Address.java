package com.hbn.learning.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Getter
@Setter
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
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}	
}
