package oOPsConcepts;

public class Topic3ConstructorChaining {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer ("Eswar", 1000.00, "eswar@email.com");
		System.out.println("Customer "+customer1.getName()+" has credit limit of "+customer1.getCreditLimit());
		
		Customer customer2 = new Customer ("Div", "div@email.com");
		System.out.println("Customer "+customer2.getName()+" has credit limit of "+customer2.getCreditLimit());
		
		Customer customer3 = new Customer ();
		System.out.println("Customer "+customer3.getName()+" has credit limit of "+customer3.getCreditLimit());

	}

}
