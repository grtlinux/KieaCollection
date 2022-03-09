package org.tain.test.t01.sample07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTestMain {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println(">>> map.size(): " + map.size());
		
		System.out.println(">>> 홍길동: " + map.get("홍길"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.printf(">>>> key: %s, val: %d\n", key, val);
		}
		System.out.println();
		
		map.remove("홍길동");
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.printf(">>>> key: %s, val: %d\n", entry.getKey(), entry.getValue());
		}
	}
}
