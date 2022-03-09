package org.tain.test.t01.sample20;

public class Message {

	private String command;
	private String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	public String getCommand() { return this.command; }
	public String getTo() { return this.to; }
	
	public String toString() {
		return String.format("[%s:%s]", this.command, this.to);
	}
}
