package com.chitkara.task;

public class Demo {
	public static void main(String[] args) {
		String str = "Hello"; //
		String str1 = str + "World"; // It will create new obj --> scp X

		// StringBuffer comes into the picture --> java 1.0 --> Thread safe --> slower,
		// Syncronised, Multithreaded System
		// StringBuilder --> Java 5.0 --> not thread safe --> faster(90% )

		StringBuilder sBuilder = new StringBuilder("Hello");
//		sBuilder.append("_World");
//		System.out.println(sBuilder);

		sBuilder.insert(5, "world");
		System.out.println(sBuilder);
//
		System.out.println(sBuilder.charAt(5));
//
		System.out.println(sBuilder.reverse());
//
//		StringBuffer sBuffer = new StringBuffer("Chitkara");
//		sBuffer.append("University");
//
//		System.out.println(sBuffer);

	}

}
