package org.tain.test.t01.sample17;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTestMain {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("강자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iter = treeSet.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> " + iter.next());
		}
	}
}
