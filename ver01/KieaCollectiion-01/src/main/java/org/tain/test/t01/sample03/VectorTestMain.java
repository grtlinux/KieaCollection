package org.tain.test.t01.sample03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTestMain {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i=0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(">>> " + board);
		}
		
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> iter: " + iter.next());
		}
		
		//////////////////////////////////////////
		Vector<Board> vector = new Vector<>();
		
		vector.add(new Board("제목1", "내용1", "글쓴이1"));
		vector.add(new Board("제목2", "내용2", "글쓴이2"));
		vector.add(new Board("제목3", "내용3", "글쓴이3"));
		vector.add(new Board("제목4", "내용4", "글쓴이4"));
		vector.add(new Board("제목5", "내용5", "글쓴이5"));
		
		Enumeration<Board> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(">>> Enumeration: " + e.nextElement());
		}
		
		iter = vector.iterator();
		while (iter.hasNext()) {
			System.out.println(">>> iter2: " + iter.next());
		}
	}
}
