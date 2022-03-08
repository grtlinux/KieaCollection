package org.tain.test.t01.sample06;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.getName().equals(this.name) && member.getAge() == this.age;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
	}
	
	public String toString() {
		return String.format("[%s:%d]", this.name, this.age);
	}
}
