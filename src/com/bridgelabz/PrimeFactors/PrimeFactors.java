package com.bridgelabz.PrimeFactors;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number Whose prime factors is to Find  ");
		int fact = scanner.nextInt();
		scanner.close();
		System.out.println("The factors are");
		for (int i=2; i<=fact; i++ ) {
			int is_prime = 0;
			int remainder = i % 10;
			if (remainder == 0) {
					is_prime ++;
			}
			while ((fact % i) == 0) {
					System.out.println(i);
					fact = fact/i;
			}
		}
	}
	

}
