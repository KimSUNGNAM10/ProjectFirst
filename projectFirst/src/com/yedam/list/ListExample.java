package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	static class Member {
		String name;
		int age;
		Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	}
	
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		members.add(new Member("HONG", 10));
		members.add(new Member("HWANG", 11));
		members.add(new Member("PARK", 12));
		for(Member mem : members) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
	//}

	//public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("HONG");
		list.add(2, "Hwang");

		String str1 = list.get(0); // Hello
		list.remove(1);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for (String str : list) {
			if(str != null) //str이 null이 아닌값만
			System.out.println(str);
		}
	}
}
