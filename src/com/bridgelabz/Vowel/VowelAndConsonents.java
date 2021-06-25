package com.bridgelabz.Vowel;

import java.util.Scanner;

public class VowelAndConsonents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  Alphabet to check weather its  vowel or not");
		char Alphabet = scanner.next().charAt(0);
		scanner.close();
		if (Alphabet == 'a' || Alphabet == 'e' || Alphabet == 'i' || Alphabet == 'o' || Alphabet == 'u' || Alphabet == 'A' || Alphabet == 'E' || Alphabet == 'I' || Alphabet == 'O' || Alphabet == 'U') {
			System.out.println("Its an Vowel");
		}
		else 
		{			
			System.out.println("Its a Consonant");
		}
		
		
	
	}


}
