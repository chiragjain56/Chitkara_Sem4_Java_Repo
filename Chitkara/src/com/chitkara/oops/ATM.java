package com.chitkara.oops;

import java.util.Scanner;

import com.chitkara.cla.CLA;

public class ATM {
	private String accountNumber;
	private String ifscCode;
	private int atmPin;
	private int balance = 0;

	// setter
	public void deposit(int amt) {
		if (amt > 0)
			balance += amt;
		else {
			System.out.println("enter the correct amt !");
		}
	}

	// getter
	public int getBalance() {
		return balance;
	}

}

class BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CLA cla = new CLA();

		ATM atm = new ATM(); // default constructor

		atm.deposit(1500);
		System.out.println(atm.getBalance());

	}
}
