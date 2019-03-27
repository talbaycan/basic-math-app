package com.albaycan.basicmathapp;

import java.util.Scanner;

public class AppManager {
	
	public static void main(String[] args) {				
	
	System.out.println("===============================");
	System.out.println("***********Welcome*************");
	System.out.printf("===============================");
	
	Scanner input = new Scanner(System.in);
	
	// Getting first number
	System.out.printf("%nPlease enter first number:").println();
	int num1 = input.nextInt();
	
	// Getting second number
	System.out.printf("%nPlease enter second number:").println();
	int num2 = input.nextInt();
	
	String choose2;
	
		do {
			// Display Menu
			System.out.printf(getMenu());
			
			// Print Calculation
			int choose = input.nextInt();
			System.out.println(calculateResult(num1, num2, choose));
			
			// Last Choice
			System.out.println("Press A to go back to menu or Ctrl+C to exit.");
			choose2 = input.next();
		} while (choose2.equals("A"));
	
	}
	
	private static String getMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("%nWhat would you like to do now?\n");
		sb.append("(1) Sum\n");
		sb.append("(2) Subtract\n");
		sb.append("(3) Multiply\n");
		sb.append("(4) Divide\n");
		sb.append("Press Ctrl+C to exit.\n");
		
		return sb.toString();
	}

	
	private static String calculateResult(int num1, int num2, int choose) {
		BasicMath bm = new BasicMath(num1, num2);
		
		switch (choose) {
		case 1:
			return String.format("%nResult is %d", bm.add());			
		case 2:
			return String.format("%nResult is %d", bm.subtract());
		case 3:
			return String.format("%nResult is %d", bm.multiply());
		case 4:
			return String.format("%nResult is %f", bm.divide());
		}
		return null;
	}
	
}



