package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
		//Calculator c1 = new Calculator(); //static 없을떄 
		//c1.pi = 2.2;
		
		
		Calculator.pi = 3.14;    //static
		Calculator.sum(45, 55);
	}
}
