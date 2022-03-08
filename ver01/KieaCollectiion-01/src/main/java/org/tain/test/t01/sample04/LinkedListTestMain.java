package org.tain.test.t01.sample04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTestMain {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(">>> 1. wasting time: " + (endTime - startTime) + "(ns)");
		
		startTime = System.nanoTime();
		for (int i=0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(">>> 2. wasting time: " + (endTime - startTime) + "(ns)");
	}
}
