package com.advanto.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buses {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	 int bid;
	 String name;
	 String bno;
	 String type;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Buses(int bid, String name, String bno, String type) {
		super();
		this.bid = bid;
		this.name = name;
		this.bno = bno;
		this.type = type;
	}
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Buses [bid=" + bid + ", name=" + name + ", bno=" + bno + ", type=" + type + "]";
	}
	
	 
}
