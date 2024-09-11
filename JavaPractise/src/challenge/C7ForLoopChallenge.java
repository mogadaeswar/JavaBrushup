package challenge;

public class C7ForLoopChallenge {

	public static void main(String[] args) {
		/*
		 * Find out the prime numbers between 20 to 50 and print
		 * 
		 */

		for (int j = 20; j <= 50; j++) {
			if (isPrime(j)) {
				System.out.println(j + " is a Prime number");
			}
		}

	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
