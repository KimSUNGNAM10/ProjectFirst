package com.yedam.generic;

public class Course<T> {

	private String name;
	private T[] Students;

	Course(String name, int capacity) {
		this.name = name;
		this.Students = (T[]) new Object[capacity]; // new T[]; 제네릭타입에서는 이런 방식 x
	}

	String getName() {
		return this.name;
	}

	T[] getStudents() {
		return Students;
	}

	void add(T t) {
		for (int i = 0; i < Students.length; i++) {
			if (Students[i] == null) {
				Students[i] = t;
				break;
			}
		}
	}
}
