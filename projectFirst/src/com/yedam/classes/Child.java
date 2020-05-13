package com.yedam.classes;

import com.yedam.classes.inherit.parent;

public class Child extends parent {
	Child() {
		super(); // Parent()
	}

	Child(String lastName, String firstName, String telNumber) {
		super(lastName, firstName, telNumber);
	}

	void showInfo() {
//protected 구분
		Child child = new Child();
		// child.getLastName();/default x
		child.getFirstName();
		child.getTelNumber();
	}

}