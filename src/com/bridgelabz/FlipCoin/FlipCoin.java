package com.bridgelabz.FlipCoin;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times you have to flip a coin : ");
		int numberOfFlips = scanner.nextInt();
		scanner.close();

		if (numberOfFlips <= 0) 
		{
			System.err.println("Please enter a postive integer");
		}

		else 
		{
			//method to flip a coin
			int countHeads = flip(numberOfFlips);

			double percentOfHeads = (countHeads*100)/numberOfFlips;
			double percentOfTails = 100-percentOfHeads;
			System.out.println("heads percentage : "+ percentOfHeads);
			System.out.println("Tails percentage : "+ percentOfTails);
		}
	}



	public static int flip(int numOfFlips) 
	{
		int countHeads = 0;
		for (int i = 0; i < numOfFlips; i++) 
		{
			//generating a random number between 0 and 1
			if (Math.random() > 0.5) 
			{
				countHeads++;
			}
		}
		return countHeads;
		
	}

}
