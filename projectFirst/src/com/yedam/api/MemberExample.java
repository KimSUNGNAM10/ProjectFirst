package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("HONG");
		Member m2 = new Member("HONG");
		Member m3 = new Member("HON");
		if(m3.equals(m2)) {
			System.out.println("동일합니다");
		} else {
			System.out.println("다릅니다");
		}
		
		System.out.println(m1.toString());
		
		if(m1 == m2) {
			System.out.println("동일한 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
	}
}
