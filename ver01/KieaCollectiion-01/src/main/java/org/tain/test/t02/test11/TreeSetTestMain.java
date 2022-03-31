package org.tain.test.t02.test11;

import java.util.TreeSet;

public class TreeSetTestMain {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println(">>> min.value: " + score);
		
		score = scores.last();
		System.out.println(">>> max.value: " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println(">>> value down: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println(">>> value up: " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println(">>> value floor: " + score);
		
		score = scores.ceiling(new Integer(95));
		System.out.println(">>> value ceiling: " + score);
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(">>> remaining count of items: " + scores.size());
		}
	}
}
