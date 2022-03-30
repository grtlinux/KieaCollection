package org.tain.test.t02.test05;

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
		System.out.println(">>> set: " + set);
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> " + iter.next());
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println(">>> set.size(): " + set.size());
		System.out.println(">>> set: " + set);
		System.out.println();
		
		set.clear();
		System.out.println(">>> set.size(): " + set.size());
		System.out.println(">>> set: " + set);
	}
}
