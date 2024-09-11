package challenge;

public class C8ForLoopAgain {

	public static void main(String[] args) {
		/*
		 * • Create a for loop using a range of numbers from 1 to 1000 inclusive. • Sum
		 * all the numbers that can be divided by both 3 and 5. • Print out the numbers
		 * that have met the above conditions. • Break out of the loop once you have
		 * found 5 numbers that met the conditions above. • After breaking out of the
		 * loop, print the sum of the numbers that met the conditions above. • Note:
		 * type all code in the main method.
		 */
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number " + i + " is divisible by both 3 and 5");
				sum += i;
				count++;
			}
			if (count == 5) {
				break;
			}

		}
		System.out.println("Sum of first 5 numbers those are divisible by 3 and 5 is: " + sum);
	}

}
