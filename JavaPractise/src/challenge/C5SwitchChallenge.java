package challenge;

public class C5SwitchChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter = 'f';
		switch(letter) {
		case 'A':
			System.out.println("Able");
			break;
		case 'B':
			System.out.println("Baker");
			break;
		case 'C':
			System.out.println("Charlie");
			break;
		case 'D':
			System.out.println("Dog");
			break;
		case 'E':
			System.out.println("Easy");
			return;
		default:
			System.out.println("Matching keyword with the "+letter+" letter not found");
			break;
		}
		
	}

}
