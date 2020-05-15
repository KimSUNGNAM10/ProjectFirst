package com.yedam.interfaces;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
		
	}
	
}
