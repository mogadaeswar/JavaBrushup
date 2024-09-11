package challenge;

public class C3HeightConvert {

	public static void main(String[] args) {
		
		/*Create two methods with the same name: convertToCentimeters.
		 * 1. The first method has one parameter of type int, which represents the entire height in inches. You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double.
		 * 2. The second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches. So if a person is 5 foot, 8 inches, the values 5 for feet and 8 
		 * for inches would be passed to this method. This method will convert feet and inches to just inches, then call the first method, to get the number of centimeters, also returning the value as a double.
		 * 
		 */ 
		System.out.println("5 ft and 8 inches is equal to: "+ convertToCentimeter(5,8)+ "cm");
		System.out.println("68 inches is equal to: "+convertToCentimeter(68)+ "cm");
	}
	
	public static double convertToCentimeter(int heightInches) {
		return (double)heightInches*2.54;
		
	}
	
	public static double convertToCentimeter(int heightInFeet, int heightInInches) {
		int feetToInches = heightInFeet*12;
		int totalheightInInches = feetToInches+heightInInches ;
		return convertToCentimeter(totalheightInInches);
	 
	}
	

}
