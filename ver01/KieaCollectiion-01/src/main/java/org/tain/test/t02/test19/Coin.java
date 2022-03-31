package org.tain.test.t02.test19;

public class Coin {

	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() { return this.value; }
	
	public String toString() {
		return String.format("[Coin:%d]", this.value);
	}
}
