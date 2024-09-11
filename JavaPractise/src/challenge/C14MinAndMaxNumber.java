package challenge;

import java.util.Scanner;

public class C14MinAndMaxNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max=0;
		double min=0;
		int loopCount=0;
		
		while(true) {
			System.out.println("Enter a number, or any character to exit:");
			String nextEntry = scanner.nextLine(); 
			try {
				double validNumber=Double.parseDouble(nextEntry);
				if(loopCount==0 || validNumber<min) {
					min = validNumber;
				}
				if(loopCount==0 || validNumber>max) {
					max = validNumber;
				}
				loopCount++;
			} catch (NumberFormatException nfe) {
				break;
			}
		}
		if(loopCount>0) {
			System.out.println("min value entered = "+min+", max value = "+max);
		}else {
			System.out.println("No valid data entered. Reexecute the code to test again");
		}

	}

}
