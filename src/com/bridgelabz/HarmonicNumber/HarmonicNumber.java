package com.bridgelabz.HarmonicNumber;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number which tyou want to find a harmonic number");
		int n = scanner.nextInt();
		scanner.close();
		double harmonumber = 0.0;
		if(0 < n){
			for (double i=1; i<=n; i++) {
				harmonumber = harmonumber +(1/i);
			}
			System.out.println("The "+n+" harmonic number is  " + harmonumber);
		}
		else {
			System.out.println("Enter value is Not valid");
		}
	}

}
