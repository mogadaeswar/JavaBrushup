public class Topic2ContolFlowStatements {
	
	public static void main(String[] args) {
		/*before starting into this do some research on what are the data types & assignment operators we use in Java
		 * 
		 */
		
		boolean isAlien = true;
		
		if(isAlien == false)
			System.out.println("It is not an alien!");
		/*instead of false if we use "true" in if condition then the next line will not be executed. try your self
		*Now I'm going to add one more print statement*/
			System.out.println("And I am scared of aliens");
			
		/*If you run the java program the second print line will be executed. because the next after line will not be consider it as under the if statement. 
			Here the code block concept comes in*/

			if(isAlien == true) {
				System.out.println("Hey I'm an alien!");
				System.out.println("And boom! two lines printed now");
			}
	}
}
