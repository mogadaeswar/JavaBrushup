
public class Topic12ForLoop {

	public static void main(String[] args) {
		/*
		 * For loop in Java iterates a given set of statements multiple times. The Java
		 * while loop executes a set of instructions until a boolean condition is met
		 * for (statement 1; statement 2; statement 3) { code block to be executed }
		 */

		for (double rate = 2.0; rate <= 5; rate++) {
			//rate++ by default increase its value by 1. Instead of 1 if we want any other increments we should declare specifically. Refer below for loop
			double interestAmount = calculateInterest(10000.0, rate);
			System.out.println("10,000 at " + rate + "% interest =" + interestAmount);
		}
		for (double i = 7.5; i <= 10; i+=0.25) {
			//here I'm going to increase i value by 0.25 for each iteration
			double interestAmount = calculateInterest(100.0, i);
			System.out.println("$100 at " + i + "% interest =" + interestAmount);
		}
		
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
