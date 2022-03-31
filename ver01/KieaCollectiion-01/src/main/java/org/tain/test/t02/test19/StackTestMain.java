package org.tain.test.t02.test19;

import java.util.Stack;

import org.tain.test.t01.sample19.Coin;

public class StackTestMain {

	public static void main(String[] args) {
		// LIFO
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			System.out.println(">>> " + coinBox.pop());
		}
	}
}
