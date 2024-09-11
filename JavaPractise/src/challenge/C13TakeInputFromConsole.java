package challenge;

import java.util.Scanner;

public class C13TakeInputFromConsole {
	
	/*
	 * In this challenge, you'll read 5 valid numbers from the console entered by the user and print the sum of those five numbers.
	 * By valid numbers, I mean you need to check that the numbers entered are valid integers.
	 * If they are not, print out the message "Invalid number" to the console, but continue looping until you do have 5 valid numbers.
	 * Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count 1, 2, 3, etc.
	 * As an example, the first message would look something like, "Enter number #1:", the next,"Enter number #2:", and so on.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter =1;
		double sum =0;
		
		while(counter<=5) {
			System.out.println("Enter number #"+counter+":");
			String nextNumber = scanner.nextLine();
			try {
				//int number = Integer.parseInt(nextNumber);
				double number = Double.parseDouble(nextNumber);
				counter++;
				sum+=number;
			}catch (NumberFormatException badUserData) {
				System.out.println("Invalid number!!! Try again.");
			}
			
		}
		System.out.println("The sum of entered 5 numbers: "+sum);

	}

}
