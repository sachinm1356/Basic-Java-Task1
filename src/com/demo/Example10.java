package com.demo;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// Write a Java program to Find Quotient and Remainder for a given number.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter dividend :");

		int dividend = scanner.nextInt();

		System.out.println("Enter divisor :");

		int divisor = scanner.nextInt();

		scanner.close();

		int Quotient = dividend / divisor;
		
		int Remainder = dividend % divisor;
		
		
		System.out.println("Quotient is :"+Quotient);
		
		System.out.println("Remainder is :"+Remainder);
		
		

	}

}
