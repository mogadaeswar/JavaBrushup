
public class Topic9MethodOverLoading {
	
	//Method overloading is nothing but using the same method name but the arguments we pass will vary.
	//With respective to the parameters we pass as arguments corresponding method will be invoked.

	public static void main(String[] args) {
	 int newScore =	calculateScore("Eswar",500);
	 System.out.println("New score is "+ newScore);
	 
	 calculateScore(75);
	 calculateScore();

	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName + " scored "+ score+ " points");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored "+ score+ " points");
		
		//We can invoke another method with in the method, see below example
		return calculateScore("Anonymous", score);
	}
	
	public static int calculateScore() {
		System.out.println("No player name & No Score points");
		return 0;
	}
	
	// if we change the return data type of method and keeping the same method name will not be considered as method overloading.
	
	/* public static void calculateScore(int user) {
		System.out.println("No player name & No Score points");
	 */
	}

