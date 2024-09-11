public class Topic3LogicalOperators {
	
	public static void main(String[] args) {
		boolean isAlien = true;
		if(isAlien == true) {
				System.out.println("Hey I'm an alien!");
				System.out.println("And boom! two lines printed now");
			}
		
		int topScore =130;
		if(topScore ==130) {
			System.out.println("You got the high score!");
			/*try the same if statements with <,>,<=,>= operators*/
		}
		
		int secondTopScore = 60;
		if((topScore > secondTopScore) && (topScore<150)) {
			System.out.println("Greater than second highest but less than 150");}
			
			/*here && operator is used to compare two conditions and the code inside only execute 
			 * if both the statements are true. If any of the two conditions doesn't true then it skip execution
			 */
		if((topScore>100)|| (secondTopScore<=50)) {
			System.out.println("Either or both of the conditions are true");
		
		}
		
		/*note = is uses to assign a value and == is uses to compare the value
		 * If we use score=10 and if(score=10) to compare then it throws compilation error
		 * Coming to the boolean value it won't throw any error but if you use = inside the if condition then it takes 
		 the new value as input. 
		 eg; isAlien = false; and if(isAlien=true) ?? here it would consider the new value for isAlean as true and execute the next code block. Which is wrong
		 */
		
		boolean isCar = false;
		if(isCar) {
			System.out.println("Yes it is a car");
			
		/*here for boolean values we no need to use equals operator. If we didn't use anything by default if takes as true
		 * if we wants to make the value false we can use if(!isCar)
		 * here ! mark is indicates as "not"
		 */
		}
	}
}
