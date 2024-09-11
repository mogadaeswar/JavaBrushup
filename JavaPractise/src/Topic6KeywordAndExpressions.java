
public class Topic6KeywordAndExpressions {

	public static void main(String[] args) {
	
		/*Java has some preserved keywords. We can't use those keywords at the time of declaration.
		 * refer to the link for the reserved keywords https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9
		 * 
		 *Refer to the following code line where I'm declaring int as variable name. instead of int if we give int2 then fine
		 */
		//int int2 =5;
		
		// Now we will look into the declaration and expression statements.
		
		double kilometers = (100 * 1.609344);
		
		//here "kilometers = (100 * 1.609344)" part consider as an expression.
		// by including double and ";" we made a complete java statement.

		int highScore = 50;
		if(highScore>25) {
			highScore = 1000 + highScore;
		}
		
		/*in the above example there are 4 expressions exist. 1st is highScore declaration 
		 * 2nd is highScore>25
		 * 3rd "1000 + highScore"
		 * 4th redeclaring value to the highScore
		 */
		
		
		int health =100;
		if((health<25)&&(highScore>1000)) {
			highScore = highScore - 1000;
		}
		
		/*in the above example there are 6 expressions exist. 1st is highScore declaration 
		 * 2nd is highScore<25
		 * 3rd is highScore>1000
		 * 4th is (health<25)&&(highScore>1000)
		 * 5th "highScore-1000"
		 * 6th redeclaring value to the highScore
		 */
	}

}
