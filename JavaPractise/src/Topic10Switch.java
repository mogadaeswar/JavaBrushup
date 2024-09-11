public class Topic10Switch {

	public static void main(String[] args) {
		/* Instead of writing many if..else statements, you can use the switch
		 statement.
		 In Java, the switch statement works with the following data types:
		 Primitive data types: byte, short, char, and int
		 Wrapper classes: Byte, Short, Character, and Integer
		 Enumerated types (enums)
		 String class: (since Java 7)
		 **It's important to note that switch does not work with long, float, double, or boolean types.
		 */
		int switchValue = 5;

		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
			
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3: case 4: case 5:
			System.out.println("Value was "+switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2");
			break;
		}

	}

}
