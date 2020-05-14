package com.yedam.classes.abstract_class;
//추상클래스
public abstract class Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound();//추상메소드는  하위클래스에 정의를 해줘야됨
}
