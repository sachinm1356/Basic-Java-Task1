package com.demo;

import java.util.Scanner;

public class Example13 {


	public static void main(String[] args) { 
		
		//Reverse Sentence by user

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Sentense");

		String str= scanner.nextLine();
		
		scanner.close();

		char[] arr = str.toCharArray();

		String rev="";

		for(int i=str.length()-1; i>=0; i--) {

			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
}


