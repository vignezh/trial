package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Login {
private String userid;
private String username;
protected String userpassword;
@Id
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}

}
