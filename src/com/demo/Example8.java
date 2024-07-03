package com.demo;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		// Write a Java program that takes a year from the user and prints whether it is a leap year or not.

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Year");
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		if (year%4==0 || year/100==0 && year%400==0 ) {
			
			System.out.println("It is leap year");
		}
		else {
			System.out.println("It is not leap year");
		}
	}

}
