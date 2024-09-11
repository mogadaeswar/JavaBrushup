
public class Topic8Methods {
	
	//A method declares executable code that can be invoked, passing a fixed number of values as an arguments.
	//Method is a way of reducing code duplication.
	//A method can be executed many times with potentially different results, by passing data to method in the form of arguments.
	///if we want to execute the same if else block in previous class file with different values in a single class file, re initiating and
	//the code may very confusing and memory consuming. to avoid that we can create a method once and re-use it.

	public static void main(String[] args) {
		
	/* The below is one way of declaring the values and calling out methods
	 * boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
			calculatescore(gameover, score, levelCompleted, bonus);
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		calculateScore(gameover, score, levelCompleted, bonus);
	 */
	calculateScore(true, 800, 5, 100); //this is another way of passing values as arguments.
	calculateScore(true, 10000, 8, 200);
	//when ever we are calling a method we should pass the arguments exactly match with the declaration.
	
	int highScore= Score(10000, 8, 200);
	System.out.println("The highScore is "+highScore);
	//before above statement refer to the comments in 45 line
	}
	
	//Method(s) always should be declare outside of the Main method.
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		int finalScore =score;
		
		if(gameOver) {
			finalScore += (levelCompleted*bonus);
			finalScore +=1000;
			System.out.println("Your final score was "+ finalScore);
		}
	}
		
	/*In the above method we are not returning any value to use so, the method type we declared as void.
	 * If we need any return value from the method then we will use the respective output dataType instead of void while method declaration
	 */
		
		public static int Score(int score, int levelCompleted, int bonus) {
			int finalScore =score;
				finalScore += (levelCompleted*bonus);
				finalScore +=1000;
			return finalScore; // if we use any variable name instead of void the return statement should be must
	}
}
	
