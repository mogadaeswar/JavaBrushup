package oopsChallenge;

public class PizzaTest {
	   public static void main(String[] args) {
	       Pizza basicPizza = new Pizza();  // Calls the no-argument constructor
	       basicPizza.tastePizza();  // Tastes like cheese on thin crust!

	       Pizza customToppingPizza = new Pizza("Pepperoni");  
	       // Calls the constructor with 1 argument
	       customToppingPizza.tastePizza();  // Tastes like pepperoni on thin crust!

	       Pizza fullyCustomPizza = new Pizza("Mushrooms", "Thick Crust");  
	       // Calls the constructor with 2 arguments
	       fullyCustomPizza.tastePizza();  // Tastes like mushrooms on thick crust!
	   }
	}

