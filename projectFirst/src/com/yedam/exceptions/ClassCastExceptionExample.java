package com.yedam.exceptions;

abstract class Animal { // 추상클래스
	abstract void sound();

}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
			changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("변환 불가");
		}

		Animal cat = new Cat();
		try {
			changeDog(cat);
		} catch (ClassCastException e) {
			System.out.println("변환 불가");
		}
	}

	public static void changeDog(Animal animal) throws ClassCastException {
//	1	try {
//	2	if (animal instanceof Dog) {
		Dog dog = (Dog) animal;
		dog.sound();
// 2		} else {
//		System.out.println("변경 불가 클래스");
//	}
//	1	} catch(ClassCastException e) {
//	1		System.out.println("형변환 불가");
//		}
	}
}
