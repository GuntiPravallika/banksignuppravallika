package com.spring.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name = "name")
private String name;
@Column(name = "user_name")
private String userName;
@Column(name = "password")
private String password;
@Column(name = "DOB")
private Date DOB;
@Column(name = "adhar_no")
private String adharNo;
@Column(name = "mobile_no")
private String mobileNo;
@Column(name = "email")
private String email;
@OneToMany(mappedBy = "user")
private Set<Account> accounts;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
private Address address;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "role_id")
private Role role;

public Role getRole() {
return role;
}

public void setRole(Role role) {
this.role = role;
}

public Set<Account> getAccounts() {
return accounts;
}

public void setAccounts(Set<Account> accounts) {
this.accounts = accounts;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public User() {
super();
// TODO Auto-generated constructor stub
}

public User(int id, String name, String userName, String password, Date DOB, String adharNo, String mobileNo,
String email) {
super();
this.id = id;
this.name = name;
this.userName = userName;
this.password = password;
this.DOB = DOB;
this.adharNo = adharNo;
this.mobileNo = mobileNo;
this.email = email;
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

public Date getDOB() {
return DOB;
}

public void setDOB(Date dOB) {
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
