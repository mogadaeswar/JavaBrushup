package oopsChallenge;

public class C5OopsChallenge {
		
		public static void main(String[] args) {

	        // Creating a burger and adding toppings
	        Burger burger = new Burger("regular", 4.00);
	        burger.addToppings("BACON", "CHEESE", "MAYO");
	        burger.printItem();

	        // Creating a default meal order and customizing it
	        MealOrder regularMeal = new MealOrder();
	        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
	        regularMeal.setDrinkSize("LARGE");
	        regularMeal.printItemizedList();

	        // Creating another custom meal order
	        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
	        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
	        secondMeal.setDrinkSize("SMALL");
	        secondMeal.printItemizedList();
	    }

	}

