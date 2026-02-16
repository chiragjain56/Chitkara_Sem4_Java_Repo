package com.chitkara.oops;

public class Doubt {

	static int id;
	String nameString;
	int marks;

	void solve() {
		System.out.println("solved...");
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Doubt.id = id;
	}

}

class Main6 {

	public static void main(String[] args) {
//		Doubt.id = 10;
		Doubt dou = new Doubt();

//		Doubt.id = 20;
		dou.id = 10;
		dou.marks = 90;
		dou = null;
//		System.out.println(dou.id); // 10
		System.out.println(dou.marks); // 90

//		System.out.println(Doubt.id); // 10

	}
}
