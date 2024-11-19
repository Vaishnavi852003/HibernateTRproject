package com.advanto.Entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class RegisterUser {

    @Id
    int aadharno;
    int age;
	String name;
	String boardingpoint;
	String destinationpoint;
	@Temporal(value =TemporalType.DATE)
	Date dateofDeparture;
	boolean payment;
	
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDestinationpoint() {
		return destinationpoint;
	}
	public void setDestinationpoint(String destinationpoint) {
		this.destinationpoint = destinationpoint;
	}
	public Date getDateofDeparture() {
		return dateofDeparture;
	}
	public void setDateofDeparture(Date dateofDeparture) {
		this.dateofDeparture = dateofDeparture;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}


	
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUser(int aadharno, int age, String name, String boardingpoint, String destinationpoint,
			Date dateofDeparture, boolean payment) {
		super();
		this.aadharno = aadharno;
		this.age = age;
		this.name = name;
		this.boardingpoint = boardingpoint;
		this.destinationpoint = destinationpoint;
		this.dateofDeparture = dateofDeparture;
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "RegisteredUsers [aadharno=" + aadharno + ", age=" + age + ", name=" + name + ", boardingpoint=" + boardingpoint
				+ ", destinationpoint=" + destinationpoint + ", dateofDeparture=" + dateofDeparture + ", payment="
				+ payment + "]";
	}

	
	
	
	
}
