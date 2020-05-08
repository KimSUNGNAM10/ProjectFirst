package com.yedam.dev;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("=====================================");
			System.out.println("1.학생 수 2.점수 입력 3.점수리스트 4.분석 5.종료");
			System.out.println("=====================================");
			System.out.println("선택> ");
			int selectNO = scn.nextInt();scn.nextLine(); //사용자가 입력한 값을 적용
			if(selectNO == 1) {     // 1을 입력하고 엔터 치면 엔터만 남아서 z에서 엔터가 실행됨 그래서 nextLine
				System.out.println("학생수를 입력하세요.");
				studentNum = scn.nextInt(); //z 숫자만 입력가능 문자는 특수 처리해야됨
				scores = new int[studentNum]; //[]에 크기를 정해도 됨 
				System.out.println("배열생성 되었습니다.");
			} else if (selectNO == 2) {
				int i = 0;
				for (int score : scores) {
				System.out.println("점수를 입력하세요.");
				//score = scn.nextInt();
				scores[i++] = scn.nextInt();
				}
			} else if (selectNO == 3) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNO == 4) { //합계 평균
				int sum = 0;
				int cnt = 0;
				for (int score : scores) {
					sum += score;
					//cnt++;
				}
				double avg = (double)sum / scores.length;// scores~~ 대신 cnt:적어도 됨
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + avg);
			} else if (selectNO == 5) {
				run = false;
			} // end of if
		} // end of while
	} //end of main()
} // end of class
