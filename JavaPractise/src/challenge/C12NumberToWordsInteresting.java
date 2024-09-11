package challenge;

public class C12NumberToWordsInteresting {

	public static void main(String[] args) {
		numberToWords(100);
		
	}

	public static void numberToWords(int number) {

		if (number < 0) {
			System.out.println("Invalid Value");
		}

		int tempNum = reverse(number);
		int leadingZeroes = getDigitCount(number) - getDigitCount(tempNum);
		 if (number == 0) {
	            System.out.println("Zero");
	            return;
	        }
		while (tempNum != 0) {
			int lastDigit = tempNum % 10;
			switch (lastDigit) {
			case 0 -> System.out.println("Zero");
			case 1 -> System.out.println("One");
			case 2 -> System.out.println("Two");
			case 3 -> System.out.println("Three");
			case 4 -> System.out.println("Four");
			case 5 -> System.out.println("Five");
			case 6 -> System.out.println("Six");
			case 7 -> System.out.println("Seven");
			case 8 -> System.out.println("Eight");
			case 9 -> System.out.println("Nine");

			}
			
			tempNum /= 10;
		}
		for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
	}
	
	public static int reverse(int number) {
		int lastDigit=0;
		while(number!=0) {
			lastDigit=(lastDigit*10)+ (number%10);
			number/=10;
		}
		return lastDigit;
	}
	
	public static int getDigitCount(int number) {
		if(number<0) {
			return -1;
		}
		if(number==0) {
			return 1;
		}
		int count=0;
		while(number>0) {
				count++;
				number/=10;
		}
		return count;
	}

}
