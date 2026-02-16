package com.chitkara.oops;

class Hostel1 {
	int noOfStudents = 50;

	public Hostel1(int nos) {
		this.noOfStudents = nos;
		System.out.println(noOfStudents); // 200
	}

//	 concrete method
	void rule() {
		System.out.println("In by 9 PM.");
	}
}

class Woods1 extends Hostel1 {

	public Woods1() {
		super(200);
		System.out.println("calling woods constructor!");
	}

	// concreat method
	void rule() {
//		super();
		super.rule(); // Runs the parent logic first
		super.noOfStudents += 100;
		System.out.println(noOfStudents);
		System.out.println("But enjoy the forest view until then!");
	}

	public static void main(String[] args) {
		Woods1 woods1 = new Woods1();
		woods1.rule();

	}
}