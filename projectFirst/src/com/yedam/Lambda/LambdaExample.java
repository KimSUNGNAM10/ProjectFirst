package com.yedam.Lambda;

//class MyFuncClass implements MyFunctionalInterface {
//	@Override
//	public void run() {
//		System.out.println("실행");
//	}
//}

public class LambdaExample {
	public static void main(String[] args) {
		// 매개값이없는 인터페이스
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			// 익명구현객체
			@Override
			public void run() {
				System.out.println("실행");
			}
		};
		fi.run();
		// 람다표현식 run () 메소드 구현하는 부분
		MyFunctionalInterface fi2 = () -> System.out.println("실행"); // { };까지 삭제 가능
		// 익명구현객체
		fi2.run();

		// 매개값이 있는 인터페이스
		MySumInterface si = new MySumInterface() {

			@Override
			public void sum(int num1, int num2) {
				int result = num1 + num2;
				System.out.println("두수의 합 : " + result);
			}
		};
		si.sum(10, 20);

		// 매개값이 있는 인터페이스, 람다식
		MySumInterface si2 = (num1, num2) -> {
			int result = num1 + num2;
			System.out.println("두수의 합 : " + result);
		};
		si2.sum(10, 20);

		// 변환값이 있는 매개값이 있는 인터페이스
		MyMultiInterface mi = new MyMultiInterface() {

			@Override
			public int multi(int num1, int num2) {
				return num1 * num2;
			}
		};
		mi.multi(10, 15);
		
		// 변환값이 있는 매개값이 있는 인터페이스 람다식
		MyMultiInterface mi2 = (num1, num2) -> {
			return num1 * num2;
		};
		int result = mi2.multi(10, 15);
		System.out.println("결과값은 : " + result);

	}
}
