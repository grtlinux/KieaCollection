package org.tain.test.t02.test15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTestMain {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		NavigableMap<Integer,String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		for (Map.Entry<Integer,String> entry : descendingEntrySet) {
			System.out.println(">>> " + entry);
		}
		System.out.println();
		
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		for (Map.Entry<Integer,String> entry : ascendingMap.entrySet()) {
			System.out.println(">>> " + entry);
		}
		
	}
}
