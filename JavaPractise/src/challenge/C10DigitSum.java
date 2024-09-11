package challenge;

public class C10DigitSum {
	/*
	 * In this challenge, your task is to write a method with the name sumDigits
	 * that has a single parameter named number, of type int, and it should return
	 * an int. The method should only take a number that is a positive number. If a
	 * negative number is passed, it should return -1, meaning, an invalid value was
	 * passed. The method should parse out each digit from the number and sum the
	 * digits up. So,if 125 is the value passed to the method, the code should sum
	 * each digit, in this case, 1+ 2 + 5, and return 8, as a value. And another
	 * example, if the value is 1000, the code should sum each digit, 1 + 0 + 0 + 0,
	 * and return 1 as a value. If the number is a single digit number, simply
	 * return the number itself as the result.
	 */

	public static void main(String[] args) {
		System.out.println("sum of all digits in 1234" + "is equal to " + sumDigits(1234));
		System.out.println("sum of all digits in 4" + "is equal to " + sumDigits(4));
		System.out.println("sum of all digits in 3201" + "is equal to " + sumDigits(3201));
		System.out.println("sum of all digits in -1" + "is equal to " + sumDigits(-1));

	}

	public static int sumDigits(int num) {
		if (num < 0) {
			return -1;
		}
		if (num > 0 && num < 10) {
			return num;
		}
		int sum = 0;
		while (num > 9) {
			sum += num % 10;
			num = num / 10;
			if (num < 10) {
				sum += num;
			}
		}
		return sum;
	}

}
