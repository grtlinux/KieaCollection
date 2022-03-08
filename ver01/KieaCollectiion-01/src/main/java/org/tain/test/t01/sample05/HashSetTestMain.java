package org.tain.test.t01.sample05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTestMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
		
		System.out.println(">>> set.size(): " + set.size());
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(">>> element: " + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println(">>> set.size(): " + set.size());
		
		iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(">>> element: " + element);
		}
		
		set.clear();
		if (set.isEmpty()) System.out.println(">>> set has no element.");
	}
}
