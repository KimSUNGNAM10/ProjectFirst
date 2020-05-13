package com.yedam.classes.inherit;

public class parent {
	private String lastName;
	private String firstName;
	private String telNumber;
	
	public void Parent() {
		
	}
	
	public parent() {
	}
	public parent(String lastName, String firstName, String telNumber) {
		super();  //자바 최상위클래스  object 클래스 상속, 따로 명시안하면
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;

	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "lastName = " + lastName + "firstName = " + firstName;
	}
	
	
}
