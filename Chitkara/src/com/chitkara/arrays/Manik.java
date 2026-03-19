package com.chitkara.arrays;

class Student {
	int id;
	String name;

	public Student(int i, String n) {
		this.id = i;
		this.name = n;
	}
}

public class Manik {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arr1 = new int[5]; // Object --> Static array

		arr1[0] = -1;
		arr1[1] = -2;
		arr1[2] = -3;
		arr1[3] = -4;

//		for (int e : arr1) {
//			System.out.println(e + " ");
//		}
//
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}

		char[] ch = new char[5];

		String[] str = new String[5];

		double[] d = new double[5];

		Student[] st = new Student[6];

		st[0] = new Student(1, "Aayush");
		st[1] = new Student(2, "Aman");
		st[2] = new Student(4, "Manik");
		st[3] = new Student(5, "Janvi");
		st[4] = new Student(18, "Jiya");
		st[5] = new Student(9, "iserdeep");

		for (Student s : st) {
			System.out.println(s.id);
			System.out.println(s.name);
		}

	}

}
