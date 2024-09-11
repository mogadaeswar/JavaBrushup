package challenge;

public class C9WhileLoop {
	/*
	 * Step 1 is to create a method called isEvenNumber that takes a parameter of
	 * type int.not. Its purpose is to determine if the argument passed to the
	 * method is an even number or Return true from the method if it's an even
	 * number; otherwise, return false. Next, use a while loop to test a range of
	 * numbers from 5 up to and including 20, but printing out only the even numbers
	 * determined by the call to the isEvenNumber method.
	 * 
	 * So, Step 2 is to modify the while code. Make it also record the total number
	 * of even numbers it has found Break out of the loop once 5 even numbers are
	 * found. Finally, display the total number of odd and even numbers found.
	 */

	public static void main(String[] args) {

		int x = 4;
		int evenNumbers = 0;
		int oddNumbers = 0;
		while (x <= 20) {
			x++;
			if (!isEvenNumber(x)) {
				oddNumbers++;
				//System.out.println(x + " is a Odd Number");
				continue;
			}
			System.out.println(x + " is a Even Number");
			evenNumbers++;
			if(evenNumbers>=5){
				break;
			}
			
		}
		System.out.println("Total number of even numbers found are: " + evenNumbers);
		System.out.println("Total number of odd numbers found are: " + oddNumbers);
	}

	public static boolean isEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		} else
			return false;
	}

}
