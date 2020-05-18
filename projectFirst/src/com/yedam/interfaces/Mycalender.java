package com.yedam.interfaces;

import java.util.Calendar;

public class Mycalender {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); //오늘 날짜 현재 시간 기준
//		System.out.println(cal);
//		cal.set(2020, 3, 1); // 년 월 일  0부터 시작해서 3이 4월임
//		System.out.println("년도 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " + cal.get(Calendar.MONTH));
//		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일  : " + cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020, 1);
	}

	public static void showCal(int year, int month) {

		// year, month 달력 출력
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);

		System.out.println(" [" + year + "년" + month + "월]");
		String[] week = { " " + "Sun" + " ", "MON" + "  ", "Tue" + " ", "WED" + " ", "Thr" + " ", "Fri" + " ", "SAt" };
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println();

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%4d", today); // ??
			if ((today + dayOfWeek) % 7 == 1) // ((today + dayOfWeek -1) % 7 == 0)
				System.out.println(); // enter
			today++;
		}
	}

	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0; // 일월화수목금토 1234567
//		if (month == 5) {
//			dayOfWeek = 6; // 금
//		} else if (month == 6) {
//			dayOfWeek = 2; // 월
//		} 
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}

	public static int getLastDay(int year, int month) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			;
		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				lastDay = 29;
			else
				lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}
}
