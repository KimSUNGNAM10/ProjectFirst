package com.yedam.A;

public class Exercise04 {
	public static void main(String[] args) {
		int prencils = 534;
		int students = 30;
		
		//학생 한명이 가는 연필 수
		int pencilsPerStudent = (prencils / students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pecilsLeft = (prencils % students);
		System.out.println(pecilsLeft);
	}
}
