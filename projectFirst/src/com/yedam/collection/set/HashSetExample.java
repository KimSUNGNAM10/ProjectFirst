package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	@Override
	public int hashCode() {  //객체마다 가지고있는 값
	//	return this.name.hashCode();
	return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<Member> members = new HashSet<>();
 		members.add(new Member("HONG", 10));
 		members.add(new Member("HONG", 20));
 		members.add(new Member("HONG", 10));
 		
 		for( Member member : members) {
 			System.out.println(member.toString());
 		}
		
		
		set.add("Hello");  //set은 중복된 컬렉션은 출력하지 않음
		set.add("World");
		set.add("Hello");
		
		for (String str : set) {
			System.out.println(str.toString());
		}
	}
}
