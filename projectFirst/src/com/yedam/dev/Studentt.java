package com.yedam.dev;

public class Studentt {
	public static void main(String[] args) {
		Studenttt s1 = new Studenttt(); // 생성자
			int num1 = 100;
			s1.name = "Hong";
			s1.age = 20;
			s1.major = "English";
			
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(s1.major);
			
			Studenttt s2 = new Studenttt("Park");
			s2.name = "Park";
			s2.age = 22;
			s2.major = "History";
			
			Studenttt s3 = new Studenttt("Choi", 25);
			s3.name = "Choi";
			s3.age = 23;
			s3.major = "dwe";
			
			
			Studenttt[] students = new Studenttt[5];
			students[0] = s1;
			students[1] = new Studenttt();

			
	}
}
