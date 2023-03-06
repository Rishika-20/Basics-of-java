package com.knoldus.sumofnumbersjava;

public class SumOfTwoNumbers {

	static double sum = 0;

	public static void main(String[] args) {

		double num1 = 3.14;
		double num2 = 6.28;
		getSumOfTwoNumbers(num1, num2);

	}

	public static void getSumOfTwoNumbers(double num1, double num2) {

		sum = num1 + num2;
		System.out.println("sum of " + num1 + " and " + num2 + " is : " + sum);

	}
}
