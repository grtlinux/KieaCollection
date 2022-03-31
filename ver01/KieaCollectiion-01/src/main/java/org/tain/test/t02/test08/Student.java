package org.tain.test.t02.test08;

public class Student {

	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public int getSno() { return this.sno; }
	public String getName() { return this.name; }
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.sno == this.sno && student.getName().equals(this.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();
	}
	
	public String toString() {
		return String.format("[Student:%d,%s]", this.sno, this.name);
	}
}
