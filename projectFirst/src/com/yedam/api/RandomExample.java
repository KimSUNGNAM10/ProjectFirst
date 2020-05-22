package com.yedam.api;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("선택 번호 : ");
		int [] chkArr = new int[45];
		
		for(int i=0; i<6; i++) {
			int n = random.nextInt(45)+1;	//1~45
			if(chkArr[n-1] == 0) {
				chkArr[n-1] = 1;
				selectNumber[i] = n; 
			}else {
				i--;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(selectNumber[i] + " ");
		}
		
		if(true) {
			return;
		}
		
		
		
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.println("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.println(winningNumber[i] + " ");
		}
		System.out.println();

		// 당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨 여부");
		if (result) {
			System.out.println("1등에 당첨되셨습니다");
		} else {
			System.out.println("당첨되지 않았습니다");
		}
	}
}
