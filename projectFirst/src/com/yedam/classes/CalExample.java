package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn(); //void 라서 
		int result1 = cal.sum(10, 50);
		double result2 = cal.sum(10.1, 20.9);
		// println 메소드의 매개변수를 다르게 호출
		
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
	//void println(String str) {
		//System.out.println("결과값은 : " + str);
		double area1 = cal.getAreaRectangle(4.6, 5.5);
		cal.println("직사각형의 넓이 값은 " + area1); //?
		
		double area2 = cal.getAreaRectangle(5.5);// 값이 같으면 한번만 써도됨
		cal.println(area2);
	}
}
