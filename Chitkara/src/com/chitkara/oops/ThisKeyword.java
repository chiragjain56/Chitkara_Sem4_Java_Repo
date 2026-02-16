package com.chitkara.oops;

//can we create student object if our constructor is private if yes how 
//you can not access non static(instance) variable inside static method

public class ThisKeyword {

	// instance variable
	int x = 100;
	int marks;
	String nameString;

	void fun1() {
		// local variable
		int x = 500;
		System.out.println("inside fun1() of Demo");
		System.out.println(this); // ThisKeyword@232323 current class obj
		System.out.println(x); // 500
		System.out.println(this.x); // 100
	}

	public ThisKeyword() {
		this(5, 70, "chirag");
		System.out.println();
	}

	public ThisKeyword(int x, int marks, String nameString) {

		this.x = x;
		this.marks = marks;
		this.nameString = nameString;
	}

}

class Main16 {
	public static void main(String[] args) {
		ThisKeyword d1 = new ThisKeyword(); // Zero arg wala
		System.out.println(d1); // ThisKeyword@24d46ca6
		d1.fun1();

//		System.out.println(d1.nameString);
//		 System.out.println(this); //Compilation Error
	}
}

//Note: The ‘this’ keyword can not be used inside the static area.
