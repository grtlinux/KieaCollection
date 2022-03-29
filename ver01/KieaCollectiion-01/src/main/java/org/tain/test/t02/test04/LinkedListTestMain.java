package org.tain.test.t02.test04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTestMain {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long range = 100000;
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0; i < range; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf(">>> %d arrayList time: \t%,15d\n", range, endTime - startTime);
		
		startTime = System.nanoTime();
		for (int i=0; i < range; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf(">>> %d linkedList time: \t%,15d\n", range, endTime - startTime);
	}
}
