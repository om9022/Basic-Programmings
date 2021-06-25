package com.bridgelabz.LargestNumber;

import java.util.Scanner;

public class LargestAmong3Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value 1st number ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the value 2nd number ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the value 3rd number ");
		int num3 = scanner.nextInt();
		scanner.close();
		if ( num1 >= num2 && num1 >= num3 ) 
		{		
			System.out.println("The maximum number is "+num1);
		}
		
		else if ( num2 >= num1 && num2 >= num3 ) 
		{		
			System.out.println("The maximum number is "+num2);
		}
		else 
		{
			System.out.println("The maximum number is "+num3);
		}
	}
}
