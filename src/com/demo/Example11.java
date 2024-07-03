package com.demo;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		
		// Write a Java program to perform basic Calculator operations.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first value :");

		double firstValue = scanner.nextDouble();

		System.out.println("Enter second value :");

		double secondValue = scanner.nextDouble();

		scanner.close();

		double add = firstValue + secondValue;
		double sub = firstValue - secondValue;
		double mult = firstValue * secondValue;
		double div = firstValue / secondValue;
		double rem = firstValue % secondValue;
		
		
		System.out.println("Add value is :"+add);
		System.out.println("Sub value is :"+sub);
		System.out.println("Mult value is :"+mult);
		System.out.println("Div value is :"+div);
		System.out.println("Rem value is :"+rem);
		
		
		

	}

}
