package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스 인스턴스를 만들지 못함
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		
		animal = cat; //상속관게에서는 자동형변환
		
	}
}
