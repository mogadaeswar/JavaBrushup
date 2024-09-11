package challenge;

public class C1MethodsChallenge {
	
	/*1. Create a method displayHighScorePosition which takes two parameters player's Name & Position
	 *2. This method should print a message like "Tim managed to get into position 2 on the high score list"
	 *3. The second method should be named calculateHighScorePosition.
	 *4. This method should have only one parameter, the player's score.
	 *5. This method should return a number between 1 and 4, based on the score values shown in this table.
	 *6. Finally, we'll call both methods and display the results for the following scores: 1500, 1000,500, 100, and 25.
	 *7. If Score greater than or equal to 1000 then Position should be 1
	 *8. If Score greater than or equal to 500 but less than 1000 then position 2
	 *9. If Score greater than or equal to 100 but less than 500 then position 3
	 *10. All other scores 4
	 */

	public static void main(String[] args) {
	
		displayHighScorePosition("Eswar",1500);
		displayHighScorePosition("Divya",1000);
		displayHighScorePosition("Gopi",500);
		displayHighScorePosition("Ram",25);

	}
	
	public static void displayHighScorePosition(String playerName, int postion) {
		
		System.out.println(playerName+" managed to get into position "+ calculateHighScorePosition(postion)+" on the high score list");
		
	}
	
	public static int calculateHighScorePosition(int Score) {
		
		if (Score>=1000) {
			return 1;
		} else if(Score>=500 && Score<1000) {
			return 2;
		}else if(Score>=100 && Score<500) {
			return 3;
		}return 4;
		
	}

}
