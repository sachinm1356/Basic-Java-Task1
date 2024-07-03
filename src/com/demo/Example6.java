package com.demo;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// Write a Java program that takes three numbers from the user and prints the greatest number.


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number : ");

		double number1 = scanner.nextDouble();

		System.out.println("Enter second number : ");

		double number2 = scanner.nextDouble();

		System.out.println("Enter third number : ");

		double number3 = scanner.nextDouble();

		scanner.close();

		double greatest = (number1 >= number2)?(number1 >= number3 ? number1:number3):(number2 >= number3 ? number2:number3);  

		System.out.println("The greatest number is "+ greatest );

	}


}


