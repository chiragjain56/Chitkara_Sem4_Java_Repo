package com.encapsulation;

class Student {

	private int rollno;
	private String name;
	private int marks;

	Student() {
	};

	Student(int rn, String nameString, int mrks) {
		this.rollno = rn;
		name = nameString;
		marks = mrks;
	}

}

public class Main {

	public static void main(String[] args) {

//		int i = 1;
		// int result = ~11;
//		// 5 = 0101 in binary
//		// Invert all bits: ~0101 = 1010 (which is -6 in two's complement
//		// representation) -(x + 1)
//		System.out.println(result);

//		float f = 5.567f;
//		double d = 5.567;
//		System.out.println(f);
//		System.out.println(d);
//		System.out.printf("%.20f%n", f);
//		System.out.printf("%.25f%n", d);

//		int i = 10;
//		float f = 5.5f;
//		double d = 1.2;
//
//		double result = (f * i) + (i / d);
		// 1. (f * i) -> float * int -> promoted to FLOAT
		// 2. (i / d) -> int / double -> promoted to DOUBLE
		// 3. (Float + Double) -> promoted to DOUBLE

	}
}
