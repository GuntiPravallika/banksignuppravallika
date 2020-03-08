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
@Table(name = "role")
public class Role {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
@Column(name = "name")
private String name;
/*@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "role_id")
private User user;

public User getUser() {
return user;
}

public void setUser(User user) {
this.user = user;
}
*/
public Role() {
super();

}

public Role(int id, String name) {
super();
this.id = id;
this.name = name;

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

}



