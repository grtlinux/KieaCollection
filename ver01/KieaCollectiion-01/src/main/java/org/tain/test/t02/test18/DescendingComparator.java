package org.tain.test.t02.test18;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit f1, Fruit f2) {
		if (f1.getPrice() < f2.getPrice()) return 1;
		else if (f1.getPrice() > f2.getPrice()) return -1;
		else return 0;
	}
}
