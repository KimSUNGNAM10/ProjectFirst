package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2, "HONG");
		list.add(2, "NG");
		list.add(2, "OOOO");
		list.set(2, "Park");
		
		for(String str : list) {
			System.out.println(str.toString());
		}
		
		System.out.println(list.get(1));
		
		list.remove(4);
		System.out.println("after remove(4)");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
//		for(String str : list) {
//			System.out.println(str.toString()); //다른방식
		}
	}
}
