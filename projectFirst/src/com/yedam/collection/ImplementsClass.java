package com.yedam.collection;

interface Runnable <T>{
	public void run(T t);
}

class Car implements Runnable<String> {

	@Override
	public void run(String str) {
		System.out.println("자동차가 달린다");
	}
}
class Bus implements Runnable<String> {

	@Override
	public void run(String inte) {
		System.out.println("버스가 달린다");
	}
}


public class ImplementsClass {
	// 메소드 구현
	
	public static void callRun(Runnable<String> runnable) {
		runnable.run("Hello");
	}
	
	public static void main(String[] args) {
		Runnable<String> runnable = new Car();
		runnable.run("car");
		runnable = new Bus();
		runnable.run("bus");
		runnable = (str) -> System.out.println("익명 객체가 달립니다.");
		runnable.run("run");
		
		callRun(new Car());
		callRun((str) -> System.out.println("메소드 매개값 달립니다"));
//			@Override
//			public void run() {
//				System.out.println("메소드 매개값 달립니다");
//			}
//		});
//		runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("익명 객체가 달립니다.");
//			}	
//		};		
	}
}
