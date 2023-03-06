package com.knoldus.operationsoncircles;

//A program to calculate the area and circumference of a circle.
public class OperationsOnCircles {

	public static void main(String[] args) {

		double radius = 3;
		final double pi = 3.14;
		
		double areaOfCircle = pi* radius * radius ;
		double circumferenceOfCircle = 2 * pi * radius ;
		
		System.out.println("Area Of Circle: "+areaOfCircle);
		System.out.println("Circumference Of Circle:  "+circumferenceOfCircle);

	}

}
