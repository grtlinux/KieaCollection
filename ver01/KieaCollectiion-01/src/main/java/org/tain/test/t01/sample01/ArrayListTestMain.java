package org.tain.test.t01.sample01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestMain {

	public static void main(String[] args) {
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
}
