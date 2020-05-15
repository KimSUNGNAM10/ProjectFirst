package com.yedam.interfaces;

public class Audio implements RemoteControl {  //implements 구현하다

	@Override
	public void turnOn() {
		System.out.println("오디오 on");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 off");
	}
	
	
}
