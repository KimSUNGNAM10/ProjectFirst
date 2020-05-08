package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
	
		people p1 = new people("s", "sa", "saa");
		people p2 = new people("wds", "dsdwdw", "mkbm");
		people p3 = new people("sd", "dw", "we");

		people[] peo = new people [3];
		
		peo[0] = p1;
		peo[1] = p2;
		peo[2] = p3;
	
		System.out.println(p1);
	}
}
