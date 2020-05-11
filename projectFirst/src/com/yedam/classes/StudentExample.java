package com.yedam.classes;

public class StudentExample {

	public static void main(String[] args) {
		student stu = new student();
		stu.name = "HONG";
		stu.age = 20;
		stu.height = 179.4;
		stu.weight = 70.3;
		stu.eat("banana");

		System.out.println("이름은 : " + stu.name + ", 나이는 : " + stu.age);

		student stu1 = new student();
		stu1.name = "PARK";
		stu1.age = 23;
		stu1.height = 160.4;
		stu1.weight = 56.3;
		System.out.println("이름은 : " + stu1.name + ", 나이는 : " + stu1.age);
		stu1.eat("apple");

		student stu2 = new student("choi");
		stu2.age = 17;
		stu2.height = 150.4;
		stu2.weight = 54.3;
		System.out.println("이름은 : " + stu2.name + ", 나이는 : " + stu2.age);
		stu2.eat("쇼");

		student[] s1 = new student[3];
		student[] s2 = new student[3];
		student[] s3 = new student[3];
		s1[0] = stu;
		s2[1] = stu1;
		s3[2] = stu2;

		// String inputStr = "Choi";

		for (student stud : s1) {
			System.out.println(stud.name + "/" + stud.age);
		}
	}
}
