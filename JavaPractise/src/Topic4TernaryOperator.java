
public class Topic4TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*The ternary operator is a shortcut to assign one of two values to a variable, depending on given condition
		 * Check the below example for more clarity
		 */
		
		int ageOfClient =20;
		String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
		System.out.println("Our client is "+ageText);
		
		/* Here our logic "ageOfClient >= 18" is true then 1st string "Over Eighteen" will be assigned to ageText
		 * If the condition is false then "Still a kid" will be assigned to ageText
		 */
	}

}
