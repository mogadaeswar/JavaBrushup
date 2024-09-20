package oopsChallenge;

public class Pizza {
	   private String topping;
	   private String crust;

	   // Constructor to create a basic cheese pizza with thin crust
	   public Pizza() {
	       this("Cheese", "Thin Crust");  // Calls the next constructor (constructor chaining)
	   }

	   // Constructor to create a pizza with a custom topping
	   public Pizza(String customTopping) {
	       this(customTopping, "Thin Crust");  // Calls the next constructor (constructor chaining)
	   }

	   // Constructor to create a pizza with custom topping and crust
	   public Pizza(String customTopping, String customCrust) {
	       this.topping = customTopping;
	       this.crust = customCrust;
	   }

	   public void tastePizza() {
	       System.out.println("You're enjoying a delicious " + topping + " pizza with " + crust + "!");
	   }
	}

