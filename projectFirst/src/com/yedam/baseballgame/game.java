package com.yedam.baseballgame;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a1, a2, a3; // 랜덤으로 받는 숫자
		int c1, c2, c3; // 입력숫자
		int s, b;
		int count = 0;

		a1 = (int) (Math.random() * 10);
		do {
			a2 = (int) (Math.random() * 10);
		} while (a2 == a1);
		do {
			a3 = (int) (Math.random() * 10);
		} while (a3 == a1 || a3 == a2);
		do {
			s = b = 0;
			count++;
			System.out.println("0~9의 숫자중 3개 입력");
			c1 = sca.nextInt();
			c2 = sca.nextInt();
			c3 = sca.nextInt();

			if (c1 == a1)
				s++;
			else if (c1 == a2 || c1 == a3)
				b++;

			if (c2 == a2)
				s++;
			else if (c2 == a3 || c2 == a3)
				b++;

			if (c3 == a3)
				s++;
			else if (c3 == a1 || c3 == a2)
				b++;

			System.out.println("( " + s + " S " + b + " B )");

		} while (s < 3);
		switch ((count - 1) / 4) {
		case 0:
			System.out.println("1");break;
		case 1:
			System.out.println("2");break;
		case 2:
			System.out.println("3");break;
		case 3:
			System.out.println("4");break;
		case 4:
			System.out.println("5");break;
			
		}

		System.out.println("축" + count + "맞춤");
	}
}
