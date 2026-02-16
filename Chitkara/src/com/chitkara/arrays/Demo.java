package com.chitkara.arrays;

//class Student {
//	private int rollno;
//	private String name;
//
//	public Student(int roll, String name) {
//		this.rollno = roll;
//		this.name = name;
//	}
//
//	void print() {
//		System.out.println("Roll No: " + rollno + "\n" + "name: " + name);
//	}
//}

public class Demo {
	public static void main(String[] args) {
//		String[] strings = new String[5];
//		System.out.println(strings);
//
//		char[] ch = new char[5];
//		System.out.println(ch);

//		Student[] students = new Student[5];
//		students[0] = new Student(1, "Aman");
//		students[1] = new Student(2, "Bhivik");
//		students[2] = new Student(3, "Chirayu");
//		students[3] = new Student(4, "Deepak");
//		students[4] = new Student(5, "Elvish bhai");

//		Student[] students = { new Student(1, "Aman"), new Student(2, "Bhivik") };
//
//		Scanner sc = new Scanner(System.in);
//		int n;
//		System.out.println("Enter the n: ");
//		n = sc.nextInt();
//		Student[] students = new Student[n];

//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter the roll and name");
//			int rollno = sc.nextInt();
//			sc.nextLine();
//			String name = sc.next();
//			sc.nextLine();
//			students[i] = new Student(rollno, name);
//		}
//
//		for (Student s : students) {
//			s.print();
//		}

//		// 1st way
//		int[] arr = new int[10];

//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;

//		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 2 * count;
//			count++;
//			System.out.println(arr[i]);
//		}
//		arr[5] = 6;

		// for-each or enhanced for loop
//		for (Integer e : arr) {
//			System.out.println(e);
//		}

//		String[] name = new String[5];
//		System.out.println(arr[1]);
//		System.out.println(name[1]);
//
//		// 2nd way
//		int[] arr1 = { 1, 2, 3, 4, 5 };
//		System.out.println(arr1[1]);

//		 Compute Sum and Average

//		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
//		int sum = 0;
//		for (int number : numbers) {
//			sum += number;
//		}
//		int arrayLength = numbers.length;
//		double average = (double) sum / arrayLength;
//		System.out.println("Sum = " + sum);
//		System.out.println("Average = " + average);

		// 2 D array

//		Scanner sc = new Scanner(System.in);
//		int[][] array = new int[3][3];
//
//		System.out.println("Enter the no: ");
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				array[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}

		// Jagged Array:
//		int cols;

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the rows: ");
//		int rows = sc.nextInt();
//		int[][] array = new int[rows][];
//
//		for (int i = 0; i < rows; i++) {
//			System.out.println("Enter the cols: ");
//
//			int cols = sc.nextInt();
//			sc.nextLine();
//			array[i][cols] = sc.nextInt();
//			for (int j = 0; j < cols; j++) {
//				array[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

}
