package com.demo;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// Write a Java program to convert minutes into years and days.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter minutes :");
		
		double minutes = scanner.nextDouble();
		
		scanner.close();
		
		//convert minutes into years
		
		System.out.println("convert minutes into years : " +minutes/525600);
		
		//convert minutes into days
		
		System.out.println("convert minutes into days : " + minutes/1440);
		

	}

}
