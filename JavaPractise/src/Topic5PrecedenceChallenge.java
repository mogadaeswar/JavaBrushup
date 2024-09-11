
public class Topic5PrecedenceChallenge {

	public static void main(String[] args) {
		
		/*Step 1: create a double variable with a value of 20.00.

		Step 2: create a second variable of type double with a value 80.00.

		Step 3: add both numbers together, then multiply by 100.00.

		Step 4: use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.

		Step 5: create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.

		Step 6: output the boolean variable just to see what the result is.

		Step 7: write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.*/
		
		double x = 20.00d;
		double y = 80.00d;
		double z = (x+y)*100.00d;
		/*Instead of above step if you write your line as z=x+y*100 then your z value will vary as java precedence.
		in Java * have more precedence than + operator so, first it does y*100 and then add value to x
		check the link https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		 */
		double remainder = z % 40;
		boolean isNoRemainder = (remainder == 0.00) ? true : false;
		
		if(!isNoRemainder) {
			System.out.println("got some remainder");
		}

	}

}
