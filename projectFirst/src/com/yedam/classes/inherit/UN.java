package com.yedam.classes.inherit;

public class UN extends Friend {
	String major;
	public UN (String name, String number, String major) {
		super (name, number);
		this.major = major;
	}

	@Override
	void showInfo() {
		System.out.println("이름" + name + "번호" + number + "전공" + major);
	}
}
