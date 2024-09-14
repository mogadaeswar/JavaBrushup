package oOPsConcepts;

public class Topic4PojoAndRecordStudent {
	
	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
//			Student s = new Student("S92300"+i,
//					switch(i) {
//					case 1 -> "Mary";
//					case 2 -> "Carol";
//					case 3 -> "Tim";
//					case 4 -> "Harry";
//					case 5 -> "lisa";
//					default -> "Anonymuos";
//					}, 
//					"05/11/1985", "Java MasterClass");
			
			
			/*
			 * Introduced in Java 14 as a preview feature and finalized in Java 16, records provide a concise way to create immutable data carrier classes. When you declare a record, Java automatically provides common methods like equals(), hashCode(), and toString(), as well as a compact constructor for initializing fields. Records are useful when your class is primarily used to hold data, with minimal behavior.
			 * Key Characteristics of Records:
			 * Immutable: The fields of a record are implicitly final, meaning their values cannot be changed after the object is created.
			 * Compact Syntax: Instead of writing verbose getter methods, constructors, and equals()/hashCode()/toString() methods, you can define a record in a single line.
			 * Automatic Method Generation: Java automatically generates equals(), hashCode(), and toString() methods based on the record fields.
			 */
			
			RecordJavaSudent s = new RecordJavaSudent("S92300"+i,
					switch(i) {
					case 1 -> "Mary";
					case 2 -> "Carol";
					case 3 -> "Tim";
					case 4 -> "Harry";
					case 5 -> "lisa";
					default -> "Anonymuos";
					}, 
					"05/11/1985", "Java MasterClass");
			System.out.println(s);
			// here I'm only passing object value in print statement but not calling out any 
			// toString method. However, I can see the results. It's because in java when we pass
			//a method to println it implicitly calls the toString method.
			
		}
		Student pojoStudent = new Student("POJO1","Pojo User","05/11/1985", "Java MasterClass");
		RecordJavaSudent recordStudent = new RecordJavaSudent("Record1","Record User","05/11/1985", "Java MasterClass");
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
		System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());

	}

}
