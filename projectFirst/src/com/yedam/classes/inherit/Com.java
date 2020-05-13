package com.yedam.classes.inherit;

public class Com extends Friend {
	String department;
	public Com (String name, String number, String department) {
		super (name, number);
		this.department = department;
	}

	@Override
	void showInfo() {
		System.out.println("이름" + name + "번호" + number + "부서" + department);
	}
}
