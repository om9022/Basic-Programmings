package com.bridgelabz.EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  number to check weather its  even or odd");
		int number =  scanner.nextInt();
		scanner.close();
		if (number % 2 ==0) {
			System.out.println("The number is Even	");
		}
		else
		{
			System.out.println("The number is Odd");
		}
	}

}
