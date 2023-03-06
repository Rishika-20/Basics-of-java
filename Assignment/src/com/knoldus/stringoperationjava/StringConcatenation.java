package com.knoldus.stringoperationjava;

public class StringConcatenation {

	public static void main(String[] args) {

		// Declaration and initialization of a string variable.
		String name;
		name = "John";

		// Declaration and initialization of another string variable.
		String message;
		message = " Hello ";

		concatenationOfTwoString(name, message);

	}

	// method to concatenate two strings.
	public static void concatenationOfTwoString(String name, String message) {

		String afterConcatenation = message + name;

		System.out.println(" String after concatenation:" + afterConcatenation);
	}

}
