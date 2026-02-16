package com.chitkara.cla;

import java.util.Scanner;

/*
 
Q.1 Write a Java program that takes an integer input using the Scanner class,
 reverses it, and determines if the original number is a Palindrome.


Q.2 Create a Java program using Notepad that reverses an integer and 
checks for palindromes using Command Line Arguments (CLA).
 */
public class Scanner1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Rollno: ");
		int roll_no = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the name: ");
		String name = sc.nextLine();

		System.out.println("Enter the Address: ");
		String address = sc.nextLine();

		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(address);

	}

}
