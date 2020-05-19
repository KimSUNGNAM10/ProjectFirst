package com.yedam.nestedInterfaces;

import java.util.concurrent.Callable;

class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
	
}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다");
	}
	
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		CallListener cListener = new CallListener();
		btn.setOnClickListener(cListener);
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
	
		}
	}
