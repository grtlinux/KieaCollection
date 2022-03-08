package org.tain.test.t01.sample02;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListTestMain {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용관", "김자바");
		for (String name : list1) {
			System.out.println(">>> " + name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3, 5);
		for (Integer val : list2) {
			System.out.println(">>> " + val);
		}
	}
}
