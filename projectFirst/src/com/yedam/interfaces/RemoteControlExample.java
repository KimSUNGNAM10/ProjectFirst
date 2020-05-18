package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		
		// 익명객체.
		RemoteControl rc2 = new RemoteControl() { //RemoteControl인터페이스에 구현되어야될 내용을 적어줘야됨

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니다");
			} 
		};
		rc2.turnOn();
		rc2.turnOff();
	}
}
