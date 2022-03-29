package org.tain.test.t02.test03;

public class Board {

	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String toString() {
		return String.format("[Board:%s,%s,%s]", this.subject, this.content, this.writer);
	}
}
