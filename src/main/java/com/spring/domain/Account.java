package com.spring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Account {
	@Id

    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    //@GenericGenerator(name = "native",strategy = "native")
	@Column(name="id")
	public int id;
	
	 @NotNull(message="username and password already exist")
	@Column(name="account_no")
	private String accountNo; 
	@Column(name="securityNumber")
	private String securityNumber;
	@Column(name="account_type")
	private String accountType;
	@Column(name="balance")
	private Double balance;
	@Column(name="interest_per_month")
	private int interestPerMonth;
	@Column(name="id")
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Account(int id, String accountNo, String securityNumber, String accountType, Double balance,
			int interestPerMonth, User user) {
		this.id = id;
		this.accountNo = accountNo;
		this.securityNumber = securityNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.interestPerMonth = interestPerMonth;
		this.user = user;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public int getInterestPerMonth() {
		return interestPerMonth;
	}

	public void setInterestPerMonth(int interestPerMonth) {
		this.interestPerMonth = interestPerMonth;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
