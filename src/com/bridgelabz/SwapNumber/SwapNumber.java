package com.bridgelabz.SwapNumber;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value of first Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter a value of second Number");
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("Before Swapping");
		System.out.println("The Number 1: "+num1);
		System.out.println("The Number 2: "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\n After Swapping");
		System.out.println("The Number 1: "+num1);
		System.out.println("The Number 2: "+num2);
		
		
	}
	

}
