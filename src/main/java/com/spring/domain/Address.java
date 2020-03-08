package com.spring.domain;


Address.java
##################################
package com.spring.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)

private Integer id;
@Column(name = "street")
private String street;
@Column(name = "city")
private String city;
@Column(name = "state")
private String state;
@Column(name = "country")
private String country;
@Column(name = "pincode")
private String pincode;
/*@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
private User user;

public User getUser() {
return user;
}

public void setUser(User user) {
this.user = user;
}*/

public Address() {
super();
// TODO Auto-generated constructor stub
}

public Address(Integer id, String street, String city, String state, String country, String pincode) {
super();
this.id = id;
this.street = street;
this.city = city;
this.state = state;
this.country = country;
this.pincode = pincode;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
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

