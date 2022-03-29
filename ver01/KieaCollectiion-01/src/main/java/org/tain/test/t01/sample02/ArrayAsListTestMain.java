package org.tain.test.t01.sample02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAsListTestMain {

	public static void main(String[] args) {
		String[] arrStr = new String[] { "홍길동", "신용관", "김자바" };
		System.out.println(">>> " + Arrays.toString(arrStr));
		for (String str : arrStr) {
			System.out.println(">> " + str);
		}
		
		List<String> list1 = Arrays.asList("홍길동", "신용관", "김자바");
		for (String name : list1) {
			System.out.println(">>> " + name);
		}
		
		//List<Integer> list2 = Arrays.asList(1, 2, 3, 5);  // OK
		//List<Integer> list2 = Arrays.asList(new Integer[] {1, 2, 3, 5});  // OK
		List<Integer> list2 = Arrays.stream(new int[]{1, 2, 3, 5}).boxed().collect(Collectors.toList());  // OK
		for (Integer val : list2) {
			System.out.println(">>> " + val);
		}
	}
}
