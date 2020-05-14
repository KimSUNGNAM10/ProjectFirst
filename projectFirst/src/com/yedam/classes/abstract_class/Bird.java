package com.yedam.classes.abstract_class;

public class Bird extends Animal {

	public Bird(String kind) {
		super(kind);

	}

	@Override
	public void sound() {
		System.out.println("짹");
	}
	
}
