package com.yedam.dev;

public class Studenttt {
	//필드
	String name;
	int age;
	String major;
	// 생성자 (필드값 초기화)
	public Studenttt() {
		
	}
	
	public Studenttt (String name) {
		this.name = name;
	}
	public Studenttt (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Studenttt(String name, int age, String major) {
		//this.();
		this.name = name;
		this.age = age;
		this.major = major;
	}  //this 객체
	
	//메소드
	void setMajor(String major) {
		this.major = major;
		
	}
	
}
