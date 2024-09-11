package challenge;

public class C4SecondsAndMinutes {

	public static void main(String[] args) {
		System.out.println(getDurationString(-3945));
		System.out.println(getDurationString(-65,45));
		System.out.println(getDurationString(65,145));
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(3945));

	}
	
	public static String getDurationString(int seconds) {
		if(seconds<0) {
			return "Invalid data for seconds(" + seconds + "), must be postive integer value";
		}else {
		int minutes = seconds/60;
		return getDurationString(seconds/60 ,seconds%60);
		}
		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes<0) {
			return "Invalid data for minutes(" + minutes + "), must be postive integer value";
		}
		if(seconds<0 || seconds>90) {
			return "Invalid data for seconds(" + minutes + "), must be between 0 and 59";
		}
		
		int hours = minutes/60;
		int remainingMinutes = minutes%60;
		
		return hours + "h " + remainingMinutes + "m "+ seconds+ "s";
		
	}

}
