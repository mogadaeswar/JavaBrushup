package challenge;

public class C6EnhancedSwitch {

	public static void main(String[] args) {
		printDayOfWeek(9);
		printDayOfWeek(0);
		printDayOfWeek(3);
		printWeekDay(2);
		printWeekDay(4);
		printWeekDay(10);
		

	}
	
	public static void printDayOfWeek(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tueday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Invalid day";
		};
		System.out.println(day+" is "+dayOfWeek);
	}
	public static void printWeekDay(int day) {
		String dayOfWeek ="Invalid day";
		if(day==0) {
			dayOfWeek ="Sunday";
		}else if (day==1) {
			dayOfWeek ="Monday";
		}else if (day==2) {
			dayOfWeek ="Tueday";
		}else if (day==3) {
			dayOfWeek ="Wednesday";
		}else if (day==4) {
			dayOfWeek ="Thursday";
		}else if (day==5) {
			dayOfWeek ="Saturday";
		}else if (day==6) {
			dayOfWeek ="Sunday";
		}System.out.println(day+" is "+dayOfWeek);
	}

}
