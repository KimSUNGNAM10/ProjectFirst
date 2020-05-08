package com.yedam.classes;

public class student {
	// (속성) - 필드
	String name;// 이름
	int age; // 나이
	double height; // 키
	double weight; // 몸무게
	
	// (생성자) - 필드 초기값 지정
	student() {
		System.out.println("생성자 호출.");
	}
	
	student(String name) {
		this.name = name; //정의 된 필드를 지목
		
	}
	
	// (기능) - 메소드 (반환타입이 있어야됨)
	void study() {
		System.out.println("공부합니다.");
	}// 공부한다
	void eat (String str) {
		System.out.println(str + "밥을 먹는다.");
	}// 먹는다
}
