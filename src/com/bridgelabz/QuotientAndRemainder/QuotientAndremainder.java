package com.bridgelabz.QuotientAndRemainder;

import java.util.Scanner;

public class QuotientAndremainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number of which you want to find quotient and  remainder ");
		double divident = scanner.nextInt();
		System.out.println("Enter The divisor");
		double divisor = scanner.nextInt();
		scanner.close();
		
		System.out.println("The Quotient is "+( divident / divisor ));
		System.out.println("The remainder is "+( divident % divisor ));		
	}

}
