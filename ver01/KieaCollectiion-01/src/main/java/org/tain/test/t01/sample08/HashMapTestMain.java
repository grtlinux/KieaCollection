package org.tain.test.t01.sample08;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestMain {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 90);
		
		for (Map.Entry<Student, Integer> entry : map.entrySet()) {
			System.out.println(">>> " + entry.getKey() + ", " + entry.getValue());
		}
	}
}
