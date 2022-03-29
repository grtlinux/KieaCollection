package org.tain.test.t02.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class ArrayListTestMain {

	public static void main(String[] args) {
		test01();
		test02();
		test03();
	}
	
	private static void test01() {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		System.out.println(">>> list.size(): " + list.size());
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(">>> list.get(2): " + skill);
		System.out.println();
		
		for (int i=0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(">>> list.get(" + i + "): " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for (int i=0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(">>> list.get(" + i + "): " + str);
		}
	}
	
	private static void test02() {
		List<String> list = Arrays.asList(
			"Java",
			"JDBC",
			"Servlet/JSP",
			"iBatis"
		);
		//list.add(2, "Database");
		
		System.out.println(">>> list.size(): " + list.size());
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(">>> list.get(2): " + skill);
		System.out.println();
		
		Stream<String> stream = list.stream();
		stream.forEach((e) -> {System.out.println(">> " + e);});
		System.out.println();
		
		//list.remove(2);
		//list.remove(2);
		//list.remove("iBatis");
		
		list.stream().forEach((e) -> { System.out.println(">>>>" + e); });
		System.out.println();
	}
	
	private static void test03() {
		List<String> list = Arrays.asList(
				"Java",
				"JDBC",
				"Servlet/JSP",
				"iBatis"
			);
		
		list.stream().forEach(e -> System.out.println(">>> " + e));
		System.out.println();
		
		IntStream.range(0, list.size())
			.forEach(index -> System.out.printf(">>>> (%d) %s\n", index, list.get(index)));
	}
}
