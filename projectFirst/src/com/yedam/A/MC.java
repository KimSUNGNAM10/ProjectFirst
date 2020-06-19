package com.yedam.A;

public class MC {
	public static void main(String[] args) {
		int[] num = new int[10];
		int ran;
		for (int i = 0; i < 10; i++) {
			ran = (int) (Math.random() * 10 + 1);
			num[i] = ran;
			for (int j = 0; j < i; j++) {
				if (num[j] == num) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i] + " ");
		}
	}
}
