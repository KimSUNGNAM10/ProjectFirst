package com.yedam.classes.inherit;

public class Gugudan {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {

				System.out.print(j + "*" + i + "=" + (j*i) + " ");
			}
			System.out.println();
		}
	}
}