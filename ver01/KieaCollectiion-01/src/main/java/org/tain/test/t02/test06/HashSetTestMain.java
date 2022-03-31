package org.tain.test.t02.test06;

import java.util.HashSet;
import java.util.Set;

public class HashSetTestMain {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println(">>> set: " + set);
	}
}
