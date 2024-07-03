package com.demo;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		//Write a Java program to print the area of a traingle
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter base value :");
		double base = scanner.nextDouble();

		System.out.println("Enter height value :");
		double height = scanner.nextDouble();
		scanner.close();

		
//		double base = 23.0;
//		double height = 17.0;
		
		double areaOfTrianle = (base*height)/2;
		
		System.out.println("The area of a Traingle = " +areaOfTrianle);
	}

}
