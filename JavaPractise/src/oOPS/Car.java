package oOPS;

/*
 * this class file is to describe about encapsulation in java
 */
public class Car {
	private String make;
	private String model;
	private String color;
	private int doors;
	private boolean convertible = true;
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setMake(String make) {
		this.make =make;
	}
	
	/*The this keyword refers to the current object in a method or constructor.
	 * The most common use of the this keyword is to eliminate the confusion 
	 * between class attributes and parameters with the same name (because a class 
	 * attribute is shadowed by a method or constructor parameter)
	 */
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public void describeCar() {
		System.out.println(doors + "-Door "+
				color + " "+
				make+ " "+
				model + " "+
				(convertible ? "Convertible" :"not Convertible"));
	}

}
