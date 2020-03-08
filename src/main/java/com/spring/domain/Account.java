package com.spring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "account")

public class Account {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
@Column(name = "account_no")
private String accountNo;
@Column(name = "security_number")
private String securityNumber;
@Column(name = "account_type")
private String accountType;
@Column(name = "created_date")
private Date Created;
@Column(name = "balance")
private Double balance;
@Column(name = "interest_per_month")
private Integer interestPerMonth;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="user_id")
private User user;

public Account() {
super();
// TODO Auto-generated constructor stub
}

public Account(Integer id, String accountNo, String securityNumber, String accountType, Date created,
Double balance, Integer interestPerMonth, User user) {
super();
this.id = id;
this.accountNo = accountNo;
this.securityNumber = securityNumber;
this.accountType = accountType;
Created = created;
this.balance = balance;
this.interestPerMonth = interestPerMonth;
this.user = user;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
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

public Date getCreated() {
return Created;
}

public void setCreated(Date created) {
Created = created;
}

public Double getBalance() {
return balance;
}

public void setBalance(Double balance) {
this.balance = balance;
}

public Integer getInterestPerMonth() {
return interestPerMonth;
}

public void setInterestPerMonth(Integer interestPerMonth) {
this.interestPerMonth = interestPerMonth;
}

public User getUser() {
return user;
}

public void setUser(User user) {
this.user = user;
}

}




