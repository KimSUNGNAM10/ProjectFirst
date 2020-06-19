package com.yedam.Lambda;

import java.util.function.UnaryOperator;

public class LambdaExample3 {
	public static void main(String[] args) {
		
		UnaryOperator<String> uo = new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				return t.substring(t.length() - 3);
			}
		};
		
		System.out.println(uo.apply("HelloWorld"));
	}
}
