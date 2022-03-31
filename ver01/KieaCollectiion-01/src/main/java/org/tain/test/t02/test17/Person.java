package org.tain.test.t02.test17;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	
	public String toString() {
		return String.format("[Person:%s,%d]", this.name, this.age);
	}
	
	@Override
	public int compareTo(Person person) {
		if (this.age < person.age) return -1;
		else if (this.age > person.age) return 1;
		else return 0;
	}
}
