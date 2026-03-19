package com.chitkara.string;

class Strings {
	public static void main(String[] args) {

//		StringBuilder sb = new StringBuilder("Hello");
//		sb.append("world");
//		System.out.println(sb);

//		sb.insert(5, " world");
//		System.out.println(sb);
//
//		System.out.println(sb.charAt(4));
//
//		System.out.println(sb.reverse());

		String s1 = "hello";
		String s2 = "hello";
//
//		System.out.println(s1 == s2); // true
//
//		String s3 = new String("helloo");
//		String s4 = new String("hello");
//
//		System.out.println(s1 == s3); // false
//		System.out.println(s1.equals(s3));// true
//
//		System.out.println(s3 == s4); // false

		// s1 == s2 --> 0
		// s1 > s2 --> +ve no
		// s1 < s2 --> -ve no

		if (s1.equals(s2)) {
			System.out.println("+ve value");
		} else {
			System.out.println("-ve value");
		}

//		System.out.println("hi");
//		String s1 = "hello"; // scp

//		String s3 = s1 + "world"; // new obj will be created in scp
//		String s2 = new String("hello"); // heap

//		System.out.println(s1 == s2); // false
//		System.out.println(s1.equals(s2)); // true
//
//		String str3 = new String("hello").intern();// move to scp
//
//		System.out.println(s1 == str3); // true

		/*
		 * * charAt() split() length() isEmpty() compareTo() toUpperCase() /
		 * toLowerCase(): Changes the casing. toUpperCase():
		 * 
		 * trim(): Removes leading and trailing whitespace.
		 * 
		 * replace(char old, char new): Swaps all occurrences of a character.
		 * 
		 * substring(int begin, int end): Cuts a piece out.
		 * 
		 * indexOf(String s): Returns the index of the first occurrence of a
		 * character/string. Returns -1 if not found.
		 * 
		 * lastIndexOf(String s): Same as above, but starts from the end.
		 * 
		 * split(String regex): Breaks a string into an array based on a delimiter.
		 * 
		 * "A,B,C".split(",") $\rightarrow$ ["A", "B", "C"]
		 * 
		 * String.valueOf(anything): Converts primitives (int, double, boolean) into a
		 * String.
		 * 
		 * String.join(delimiter, elements): Joins multiple strings
		 * 
		 * together.String.join("-", "01", "01", "2024") $\rightarrow$ "01-01-2024"
		 */

		String name = " Chitkara University ";
		String name1 = name.trim();
		System.out.println(name1);
		for (int i = 0; i < name1.length(); i++) {
			System.out.print(name1.charAt(i) + "_");
		}

		System.out.println();

		for (String s : name1.split(" ")) {
			System.out.println(s);
		}

		System.out.println(name1.replace('a', 'm'));

		System.out.println(name1.substring(0, 3));

		System.out.println(name1.indexOf('k'));

		System.out.println(name1.lastIndexOf('U'));

//		String str3 = new String("hello");
//
//		System.out.println(str == str1); // true
//
//		System.out.println(str == str2); // false
//
//		System.out.println(str2 == str3); // false

//		String s2 = "fello"; // scp <20

//		System.out.println(str.length()); // 5
//
//		System.out.println(str.charAt(4)); // o
//
//		System.out.println(str.concat(str1));

		// s1 == s2 --> 0
		// s1 > s2 --> +ve no
		// s1 < s2 --> -ve no

//		if (s1.compareTo(s2) > 0) {
//			System.out.println("+ve value");
//		} else {
//			System.out.println("-ve value");
//		}

		/*
		 * s1 = s2 --> 0 s1 > s2 --> +ve value s1 < s2 --> -ve value
		 */

//		if (s1.equals(s2))
//			System.out.println("+ve value");
//		else {
//			System.out.println("-ve value");
//		}

		/*
		 * o append() ○ insert() ○ deleteCharAt() ○ replace() ○ reverse()
		 */
		// 1. Create a StringBuilder
//		StringBuilder sb = new StringBuilder("Chitkara");
//
//		// 2. Modifying the same object (No new object created!)
//		sb.append(" University");
//		System.out.println(sb); // Output: Chitkara University
//
//		// 3. Inserting text at a specific index
//		sb.insert(8, " Rajpura");
//		System.out.println(sb); // Output: Chitkara Rajpura University
//
//		// 4. Reversing the string (Not possible in String class!)
//		sb.reverse();
//		System.out.println(sb); // Output: ytisrevinU arujpaR arakitihC
//
//		// 5. Converting back to String if needed
//		String finalResult = sb.toString();

		/*
		 * 5. FizzBuzz 4. Contains Duplicate 3.Reverse String (In-Place) 4. Valid
		 * Palindrome
		 */

	}

}
