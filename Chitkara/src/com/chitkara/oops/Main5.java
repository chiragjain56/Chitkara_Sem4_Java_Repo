package com.chitkara.oops;

import java.util.Objects;

class Student {
	String name;
	int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

//	// 1. Overriding equals()
//	@Override
//	public boolean equals(Object obj) {
//		// If pointing to same memory address
//		if (this == obj)
//			return true;
//
//		// If object is null or from a different class
//		if (obj == null || getClass() != obj.getClass())
//			return false;
//
//		// Typecast and compare the actual data (rollNo)
//		Student student = (Student) obj;
//		return rollNo == student.rollNo;
//	}
//
//	// 2. Overriding hashCode()
//	@Override
//	public int hashCode() {
//		// Generates a hash based on the rollNo field
//		return Objects.hash(rollNo);
//	}
}

class Main5 {
	public static void main(String[] args) {
		Student s1 = new Student("Aryan", 101);
		Student s2 = new Student("Aryan", 101);

		System.out.println("Using equals(): " + s1.equals(s2)); // true
		System.out.println("s1 Hash: " + s1.hashCode());
		System.out.println("s2 Hash: " + s2.hashCode()); // Same as s1
	}
}