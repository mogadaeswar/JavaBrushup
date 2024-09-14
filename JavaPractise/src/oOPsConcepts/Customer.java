package oOPsConcepts;

public class Customer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	public Customer() {
		this("Unknown","unknow@email.com");
	//this is no argument constructor but with help of this keyword I'm calling out second method here.
		
	}
	public Customer(String name,String email) {
		this(name,6000.00,email);
	//this is a constructor with two arguments but with help of this keyword I'm calling out third method here.
		//this is called constructor chaining.
	}
	
	public Customer(String name, double creditLimit,String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

}
