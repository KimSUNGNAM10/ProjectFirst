package com.yedam.generic;

import java.util.Arrays;

//<T>
//<?>, <? extends class>하 상,  <? super class> 상, 하 
//person -> Worker
// 		 -> Student -> HighStudent

//Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<Person>, Course<Worker>. Course<Student>, Course<HighStudent> 매개값으로 모두
		// 받을수있음
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));

	}

	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));

	}

	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<Worker>("직장인 과정", 5);
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStudent = new Course<Student>("학생 과정", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));

		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생과정", 5);
		courseHigh.add(new HighStudent("고등학생"));

		// Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);

		// Course<? extends class>
		registerStudent(courseStudent);
		registerStudent(courseHigh);

		// Course<? super class>
		registerWorker(coursePerson);
		registerWorker(courseWorker);
		// registerWorker(courseStudent); 타입이 안맞아서 에러

	}
}
