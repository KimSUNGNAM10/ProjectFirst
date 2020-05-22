package com.yedam.generic;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer>box = Utils.boxing(new Integer(10));
		Integer num = box.get();
		System.out.println(num);
		
		Box<String> strBox = Utils.boxing("Park");
		String result = strBox.get();
		System.out.println(result);
	}
}
