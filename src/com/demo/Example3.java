package com.demo;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// Write a Java program to swap two variables.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first value :");
		double firstValue = scanner.nextDouble();

		System.out.println("Enter second value :");
		double secondValue = scanner.nextDouble();
		scanner.close();

		//		int a=10;
		//		int b=20;
		
		double temp;
		
		System.out.println("...........Before swapping...............");
		
		System.out.println("The first value is "+firstValue );
		System.out.println("The second value is "+secondValue );
		
		temp = firstValue;
		firstValue=secondValue;
		secondValue=temp;
		
		System.out.println("..........After swapping.................");

		System.out.println("The first value is "+firstValue );
		System.out.println("The second value is "+secondValue );

	}

}
