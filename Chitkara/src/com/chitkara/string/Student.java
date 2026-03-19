package com.chitkara.string;

public class Student {

	int rollno;
	String nameString;

	public Student(int r, String name) {
		this.rollno = r;
		this.nameString = name;
	}

	@Override
	public String toString() {
		return "rollno: " + rollno + " name: " + nameString;
	}

}

class Main4 {
	public static void main(String[] args) {
		Student student = new Student(1, "aman");
		Student student2 = new Student(2, "bharat");

		System.out.println(student); // calling toString method
		System.out.println(student2);
	}
}
