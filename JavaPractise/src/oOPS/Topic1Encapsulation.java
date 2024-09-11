package oOPS;

/*
 * Java Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.
 * In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. To allow outside access to 
 * the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. 
 * By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent.
 */

public class Topic1Encapsulation {
	
	public static void main(String[] args) {
	
		Car Acura = new Car();
		
		/*
		 * A getter is a method on a class that retrieves the value of a private field and returns it.
		 * A setter is a method on a class that sets the value of a private field.
		 * The purpose of these methods is to control and protect access to private fields.
		 */
		Acura.setMake("Acura");
		Acura.setModel("RDX-AWH Technology Pack");
		Acura.setColor("Silver");
		Acura.setDoors(4);
		Acura.setConvertible(false);
		System.out.println("make= "+Acura.getMake());
		System.out.println("model= "+Acura.getModel());
		Acura.describeCar();
		
		Car mazda = new Car();
		mazda.setMake("Mazda");
		mazda.setModel("Sport");
		mazda.setColor("Black");
		mazda.setDoors(4);
		mazda.setConvertible(true);
		mazda.describeCar();
	}	
}
