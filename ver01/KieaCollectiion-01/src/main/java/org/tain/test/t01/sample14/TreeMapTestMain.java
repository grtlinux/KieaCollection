package org.tain.test.t01.sample14;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTestMain {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println(">>> first: " + entry);
		
		entry = scores.lastEntry();
		System.out.println(">>> last: " + entry);
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println(">>> lower: " + entry);
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println(">>> higher: " + entry);
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println(">>> floor: " + entry);
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println(">>> ceiling: " + entry);
		
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(">>>>> remaining count of item: " + scores.size());
		}
	}
}
