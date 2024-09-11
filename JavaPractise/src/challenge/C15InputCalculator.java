package challenge;

import java.util.Scanner;

public class C15InputCalculator {
	
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
		
	}
	public static void inputThenPrintSumAndAverage() {
		 Scanner scanner = new Scanner(System.in);
	       double sum =0;
	       int count =0;
	       while(true){
	           System.out.println("Enter a number");
	           String enteredNumber = scanner.nextLine();
	           try {
					double Number=Double.parseDouble(enteredNumber);
						sum += Number;
						count++;		
	           }catch (NumberFormatException nfe) {
	        	   break;
	        	   }
	           }
	       if(count>0) {
	    	   long roundedSum = Math.round(sum);
	    	   long average = Math.round((double)sum/count);
	    	   System.out.println("SUM = "+roundedSum+" AVG = "+average);
	       }else {
	       System.out.println("SUM = 0 AVG = 0");
	       }
		}
}
