package oOPsConcepts;

import java.util.Scanner;

public class Topic10Polymorphism {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Type(A for Adventure, C for Comedy, S for Science Friction, or Q for quit");
			String type = s.nextLine();
			if("Qq".contains(type)) {
				break;
			}
			System.out.println("Enter Movie Title");
			String title = s.nextLine();
			Movie movie = Movie.getMovie(type, title);
			movie.watchMovie();
		}
		
		
	}

}
