package org.tain.test.t02.test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class ArrayAsListTestMain {

	public static void main(String[] args) {
		test01();
		test02();
	}
	
	private static void test01() {
		String[] arrStr = new String[] { "홍길동", "신용관", "김자바" };
		System.out.println(">>> " + Arrays.toString(arrStr));
		for (String str : arrStr) {
			System.out.println(">> " + str);
		}
		System.out.println();
		
		List<String> list1;
		list1 = Arrays.asList("홍길동", "신용관", "김자바");
		list1 = Arrays.asList(new String[] { "홍길동", "신용관", "김자바" });
		for (String str : list1) {
			System.out.println(">> " + str);
		}
		System.out.println();
		
		List<Integer> list2;
		list2 = Arrays.asList(1, 2, 4, 5);
		list2 = Arrays.asList(new Integer[] {1, 2, 4, 5});
		list2 = Arrays.stream(new int[] {1, 2, 4, 5}).boxed().collect(Collectors.toList());
		for (Integer val : list2) {
			System.out.println(">> " + val);
		}
		System.out.println();
	}
	
	private static void test02() {
		List<String> list = new ArrayList<>(Arrays.asList(
				"Java",
				"JDBC",
				"Servlet/JSP",
				"iBatis"
			));
			list.add(2, "Database");
			list.remove(2);
			list.remove(2);
			list.remove("iBatis");
			
			list.stream().forEach((e) -> { System.out.println(">>>>" + e); });
			System.out.println();
	}
}
