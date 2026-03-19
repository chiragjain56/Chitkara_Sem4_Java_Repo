package com.chitkara.string;

public class PerformanceTest {
	public static void main(String[] args) {
		int iterations = 100000;

		long startTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < iterations; i++) {
			str = str + "Java";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String Time: " + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < iterations; i++) {
			sb.append("Java");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");
	}
}