package org.tain.test.t02.test18;

import java.util.Iterator;
import java.util.TreeSet;

import org.tain.test.t01.sample18.DescendingComparator;
import org.tain.test.t01.sample18.Fruit;

public class ComparatorTestMain {

	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<>();
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 9000));
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 9000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iter = treeSet.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> " + iter.next());
		}
	}
}
