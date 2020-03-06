package com.spring.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class Address {
	@Id

    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
	@Column(name="id")
	private int id;
	@Column(name="street")
	private String street;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private String pincode;
	
public Address(int id,String street,String city,String state,String country,String pincode)
{
    this.id=id;
	this.street=street;
	this.city=city;
	this.state=state;
	this.country=country;
	this.pincode=pincode;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getStreet() {
	return street;
}


public void setStreet(String street) {
	this.street = street;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String getPincode() {
	return pincode;
}


public void setPincode(String pincode) {
	this.pincode = pincode;
}


}

