package org.tain.test.t02.test03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTestMain {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "작가1"));
		list.add(new Board("제목2", "내용2", "작가2"));
		list.add(new Board("제목3", "내용3", "작가3"));
		list.add(new Board("제목4", "내용4", "작가4"));
		list.add(new Board("제목5", "내용5", "작가5"));
		
		list.remove(2);
		list.remove(3);
		
		list.stream().forEach(System.out::println);
		System.out.println();
		
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> iter: " + iter.next());
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		Vector<Board> vector = new Vector<>();
		
		vector.add(new Board("제목1", "내용1", "작가1"));
		vector.add(new Board("제목2", "내용2", "작가2"));
		vector.add(new Board("제목3", "내용3", "작가3"));
		vector.add(new Board("제목4", "내용4", "작가4"));
		vector.add(new Board("제목5", "내용5", "작가5"));
		
		vector.stream().forEach(System.out::println);
		System.out.println();
		
		Enumeration<Board> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(">>> Enumeration; " + e.nextElement());
		}
		System.out.println();
		
		iter = vector.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> iter: " + iter.next());
		}
		System.out.println();
	}
}
