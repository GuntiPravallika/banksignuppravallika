package com.spring.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;
@Entity

public class User {
	@Id
	 
	    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	    @GenericGenerator(name = "native",strategy = "native")
	//@NotNull(message = "is required")
	@Min(value =0,message = "Value should be grater than 0")
	private int id;
	//@NotNull(message = "is Required")
	@Pattern(regexp = "^[A-Z][a-z] {5}",message = "please enter 5 characters as alphabets")
	private String name;
	@Column(name="user_name")
	//@NotNull(message = "is Required")
	@Pattern(regexp = "^[A-Z][a-z] {5}",message = "please enter 5 characters as alphabets")
	@Pattern(regexp = "",message="username and password already exist")
	private String userName;
	 @Column(name="password")
	@Pattern(regexp = "",message="username and password already exist")
	private String password;
	 @Column(name=" DOB")
	private String DOB;
	 @Column(name="adhar_no")
	private String adharNo;
	 @Column(name=" mobile_no")
	private String mobileNo;
	 @Column(name="email")
	private String email;
	@OneToMany(mappedBy="user")
	List<Account> account;
	
	public User(int id, String name, String userName, String password, String DOB, String adharNo, String mobileNo,
			String email) {
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.DOB = DOB;
		this.adharNo = adharNo;
		this.mobileNo = mobileNo;
		this.email = email;

	}

	public User() {
		// TODO Auto-generated constructor stub
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
