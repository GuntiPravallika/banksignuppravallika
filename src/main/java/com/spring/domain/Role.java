package com.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import com.sun.istack.NotNull;



@Entity
public class Role {
	@Id
	//@NotNull(message="Is required")
	@Min(value =0,message = "Value should be grater than 0")
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
	private int id;
	@SuppressWarnings("deprecation")
	//@NotNull(message="Is Required")
	@Pattern(regexp = "^[A-Z][a-z] {5}",message = "please enter 5 characters as alphabets")
	private String name;

public Role(int id,String name) {
    this.id=id;
	this.name=name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Role() {
	
}
}
	

