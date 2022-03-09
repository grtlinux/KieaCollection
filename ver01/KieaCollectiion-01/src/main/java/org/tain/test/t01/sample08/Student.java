package org.tain.test.t01.sample08;

public class Student {

	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public int getSno( ) { return this.sno; }
	public String getName() { return this.name; }
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (this.sno == student.getSno()) && (this.name.equals(student.getName()));
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.sno + this.name.hashCode();
	}
	
	public String toString() {
		return String.format("[%d:%s]", this.sno, this.name);
	}
}
