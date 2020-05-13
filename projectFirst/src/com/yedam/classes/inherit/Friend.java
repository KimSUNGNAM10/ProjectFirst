package com.yedam.classes.inherit;

public class Friend {
	String name;
	String number;
	public Friend(String name, String number) {
		this.name = name;
		this.number = number;
	}
	void showInfo() {
		System.out.println("이름" + name + "번호" + number);
	
	}
	public String getname() {
		return name;
	}

		
}
