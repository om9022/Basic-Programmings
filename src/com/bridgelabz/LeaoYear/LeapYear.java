package com.bridgelabz.LeaoYear;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Year to Check weather its a Leap year ");
		int year = scanner.nextInt();
		scanner.close();
		int numberOfDigits = 0;
		int temp = 1;
//		Checking Number of digits are 4
		while (temp <= year) {
			numberOfDigits++;
			temp = temp * 10;
		}

		if(numberOfDigits == 4)
		{			
			checkLeapYear(year);
		}
		else
		{	
			System.err.println("Entered year is Not valid");	
		}
	}


	private static void checkLeapYear(int year) 
	{
		//		Condition for leap year i.e. Year should be divisible by 4 and not by 100 unless its divisible by 400 
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 ) 
		{
			System.out.println("Entered Year is a Leap yaer");
		}
		else
		{
			System.out.println("Entered year is Not a Leap yaer ");
		}
	}

}
