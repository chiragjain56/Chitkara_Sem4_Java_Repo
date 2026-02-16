package com.chitkara;

//String.valueOf(x)
//Integer.parseInt(s)

/*
 public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // && (AND)
        System.out.println("AND: " + (a < b && b > 15)); // true

        // || (OR)
        System.out.println("OR: " + (a > b || b == 20)); // true

        // ! (NOT)
        System.out.println("NOT: " + !(a == b));        // true

        // & (Logical AND - no short circuit)
        System.out.println("Logical &: " + (a < b & b > 25)); // false

        // | (Logical OR - no short circuit)
        System.out.println("Logical |: " + (a > b | b == 20)); // true

        // ^ (XOR - Exclusive OR)
        boolean x = true;
        boolean y = true;
        System.out.println("XOR (true ^ true): " + (x ^ y));   // false
        System.out.println("XOR (true ^ false): " + (x ^ !y)); // true
    }
}


//Bit wise operator


public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println("a & b: " + (a & b));   // 1
        System.out.println("a | b: " + (a | b));   // 7
        System.out.println("a ^ b: " + (a ^ b));   // 6
        System.out.println("~a: "    + (~a));      // -6 0101 --> 1010
        
        System.out.println("5 << 1: " + (5 << 1));  // 10 (5 * 2)
        System.out.println("5 >> 1: " + (5 >> 1));  // 2  (5 / 2)
           
    }
}
 
 
 */

public class Demo {
	public static void printType(Object obj) {

		System.out.println(obj.getClass());
	}

	public static void main(String[] args) {

		int a = 0xA123;
	}
}
