package com.advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String uname;
	long conNo;
	String email;
	String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getConNo() {
		return conNo;
	}
	public void setConNo(long conNo) {
		this.conNo = conNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String uname, long conNo, String email, String password) {
		super();
		this.id = id;
		this.uname = uname;
		this.conNo = conNo;
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", conNo=" + conNo + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	

}
