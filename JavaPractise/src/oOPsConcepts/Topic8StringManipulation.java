package oOPsConcepts;

public class Topic8StringManipulation {

	public static void main(String[] args) {
		String birthDate = "31/Aug/1992";
		int startingIndex = birthDate.indexOf("1992");
		System.out.println("StartingIndex = "+startingIndex);
		System.out.println("Birth Year = "+birthDate.substring(startingIndex));
		
		System.out.println("Month = "+birthDate.substring(3,5));
		
		String newDate = String.join("/", "31","11","1992");
		System.out.println("newDate = "+newDate);
		
		newDate = "25";
		newDate = newDate.concat("/");
		newDate = newDate.concat("11");
		newDate = newDate.concat("/");
		newDate = newDate.concat("1992");
		System.out.println("newDate = "+newDate);
		
		newDate = "25"+"/"+"11"+"1992";
		System.out.println("newDate = "+newDate);
		
		newDate = "25".concat("/").concat("11").concat("/").concat("1992");
		System.out.println("newDate = "+newDate);
		
		System.out.println(newDate.replace("/", "-"));
		System.out.println(newDate.replace("2", "00"));
		
		System.out.println(newDate.replaceFirst("/", "-"));
		System.out.println(newDate.replaceAll("/", "-"));
		
		System.out.println("ABC\n".repeat(3));
		System.out.println("-".repeat(20));
		
		System.out.println("ABC\n".repeat(3).indent(8));
		System.out.println("-".repeat(20));
		
		System.out.println("    ABC\n".repeat(3).indent(-2));
		System.out.println("-".repeat(20));
	}

}
