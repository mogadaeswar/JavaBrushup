public class Topic11EnhancedSwitch {

	public static void main(String[] args) {

		int switchValue = 5;

		switch (switchValue) {
		case 1 -> System.out.println("Value was 1");
		case 2 -> System.out.println("Value was 2");
		case 3, 4, 5 -> System.out.println("Value was " + switchValue);
		default -> System.out.println("Was not 1 or 2");
		}

		String month = "October";
		System.out.println(month + " is in the " + getQuarter(month) + " quarter");
	}

	public static String getQuarter(String month) {
		return switch (month) {
		case "January", "February", "March" -> "1st";
		case "April", "May", "June" -> "2nd";
		case "July", "August", "September" -> "3rd";
		case "October", "November", "December" -> "4rd";
		default -> {
			String badResponse = month + " is bad";
			yield badResponse;
		}
		};
	}

}
