package challenge;

public class C11CheckisPalindrome {
	/*
	 * Write a method called isPalindrome with one int parameter called number.
	 * The method needs to return a boolean.
	 * It should return true if the number is a palindrome number otherwise it should return false. 
	 * Check the tips below for more info about palindromes.
	 * Example Input/Output
	 * isPalindrome(-1221); → should return true
	 * isPalindrome(707); → should return true
	 * isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212
	 */

	public static void main(String[] args) {
		
		System.out.println("12 is a palindrome number? :"+isPalindrome(12));
		System.out.println("707 is a palindrome number? :"+isPalindrome(707));
		System.out.println("12121 is a palindrome number? :"+isPalindrome(12121));
		System.out.println("12131 is a palindrome number? :"+isPalindrome(12131));

	}

	public static boolean isPalindrome(int number) {

		int reverse = 0;
		int original = number;

		while (original != 0) {
			reverse = (reverse * 10) + original % 10;
			original /= 10;
		}
		return reverse == number;
	}

}
