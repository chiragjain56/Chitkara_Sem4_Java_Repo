package com.chitkara.oops;

class Student1 {
	String nameString;
	int id;

	private Student1() {

	}

	static Student1 getObject() {
		return new Student1();
	}

}

class Main13 {
	public static void main(String[] args) {
//		Student1 student1;
//		student1 = new Student1();
		Student1.getObject();

	}
}