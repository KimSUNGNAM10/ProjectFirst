package com.yedam.A;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //y--는 ; 이후에 - 됨
		System.out.println(z);
	}
}
