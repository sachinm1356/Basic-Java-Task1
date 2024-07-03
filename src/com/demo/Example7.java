package com.demo;

import java.util.Scanner;

public class Example7 { 

	public static void main(String[] args) { 

		// Write a Java program to reverse sentence.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter month :");

		int month = scanner.nextInt();

		System.out.println("Enter year :");

		int year = scanner.nextInt();

		scanner.close();


		switch (month) {
		// Cases for 31 Days
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days is 31");
			break;

			// Cases for 30 Days
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days is 30");
			break;

			// Case for 28/29 Days
		case 2:
			if((year%400==0) || ((year%100!=0)&&(year%4==0)))
				System.out.println("Number of days is 29");
			else System.out.println("Number of days is 28");
			break;

		default:
			System.out.println("Invalid Month.");
			break;
		}

	}
}

