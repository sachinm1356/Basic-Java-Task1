package com.demo;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		//Write a Java program to print the area and perimeter of a rectangle
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length :");
		double length = scanner.nextInt();

		System.out.println("Enter length :");
		double width = scanner.nextInt();
		scanner.close();



		//	    double length = 20.0;
		//		double width = 10.0;


		//Calculate area
		double area = length*width;

		//Calculate perimeter
		double perimeter = 2*(length+width);


		System.out.println(area+ " cm2");

		System.out.println(length+ " cm");

		System.out.println(width+ " cm");

		System.out.println(perimeter + " cm2");


	}

}
