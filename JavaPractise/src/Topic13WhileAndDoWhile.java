
public class Topic13WhileAndDoWhile {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			System.out.println(i);
		}
		
		//in while loop we only declare the condition. Initiation and updation we will declare separately.
		// generally while loop we will use when we can't predict how many times the iteration should happen.
		//below is the simple code but it may look familiar. We will solve few exercises on while loop to get more clarity.
		
		int j=1;
		while (j<=3) {
			System.out.println(j);
			j++;
		}
		
		//In do while we will allow java to run the code once before checking the condition.
		
		int k=1;
		boolean isReady = false;
		do {
			if(k>5) {
				break;
			}
			System.out.println(k);
			k++;
		}while (isReady);
		
		// Now continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

		int number =0;
		while (number<50) {
			number+=5;
			if(number%25==0) {
				continue;
			}
			
			//here continue statement skips the Iteration if condition matches and continue with next one.
			System.out.print(number+"_");
		}
	}

}
