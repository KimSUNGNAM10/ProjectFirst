package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	public static void getMap(Map<Integer,String> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			if(num>=80) {
			String val = map.get(num);
			System.out.println(val);
			}
		}
	}
	
	public static void main(String[] args) {
		Map<Integer, String> scores = new HashMap<>();
		scores.put(90, "HONG");
		scores.put(78, "HOON");
		scores.put(80, "PARK");
		
		System.out.println("80점 이상인 학생");
		getMap(scores);
		System.out.println("===========");
		
		List<String> list = new ArrayList<>();
		list.add("HONG");
		list.get(0);

		Set<String> set = new HashSet<>();
		set.add("HONG");
		set.add("HOON");
		Iterator<String> iterator = set.iterator(); // 반복자
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str.toString());
		}

		Map<String, Integer> map = new HashMap<>();
		// key : value -> Map.Entry
		map.put("HONG", 98);
		map.put("HOON", 90);
		map.put("HONG", 97);

		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key : " + key + ", value : " + val);
		}
	}
}
