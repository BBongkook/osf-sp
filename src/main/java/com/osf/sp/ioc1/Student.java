package com.osf.sp.ioc1;

public class Student {
	
	private Person p;
	private Animal a;
	public Student(Person p) {
		this.p = p;
	}
	public Student(Animal a) {
		this.a = a;
	}
	
	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + "]";
	}
}
