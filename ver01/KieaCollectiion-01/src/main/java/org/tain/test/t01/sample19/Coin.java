package org.tain.test.t01.sample19;

public class Coin {

	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() { return this.value; }
	
	public String toString() {
		return String.format("[coin:%d]", this.value);
	}
}
