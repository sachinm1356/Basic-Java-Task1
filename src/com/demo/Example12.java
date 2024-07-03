package com.demo;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {

		// Write a simple Java program to calculate a Factorial of a number.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number :");

		int number = scanner.nextInt();
		scanner.close();


		int factorial = 1;

		for(int i=1; i<=number; i++) {

			factorial = factorial*i;
		}


		System.out.println("Factorial of a "+number+ "! is " +factorial);


	}

}


