package com.demo;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		// Write a Java program to Calculate Simple Interest for a given amount,rate of interest and time duration.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter amount :");

		double amount = scanner.nextDouble();
		
		System.out.println("You enter amount : "+amount);

		System.out.println("Enter rate of interest :");

		double rateOfInterest = scanner.nextDouble();
		
		System.out.println("You enter rate of interest : "+rateOfInterest);
		
		System.out.println("Enter time duration in months : ");

		double timeDuration = scanner.nextDouble();
		
		scanner.close();
		
		double Interest = 0.0;
		
		if (timeDuration>0) {
			
			System.out.println("You enter valid month/months : "+timeDuration);
		}
		else {
			System.out.println("Enter valid month/months ");
		}
		
		Interest = (amount * rateOfInterest * timeDuration);
		
		System.out.println("Simple Interest :" +Interest);

	}

}
