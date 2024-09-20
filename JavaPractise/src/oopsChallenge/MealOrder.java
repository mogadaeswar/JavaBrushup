package oopsChallenge;

/*
 * Represents a meal order, which includes a burger, a drink, and a side item.
 */
public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    /*
     * Default constructor that creates a standard meal with a regular burger, coke, and fries.
     */
    public MealOrder() {
        this("regular", "coke", "fries");
    }

    /*
     * Custom constructor that allows different burger, drink, and side options.
     */
    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    /*
     * Returns the total price for the entire meal.
     */
    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    /*
     * Prints an itemized list of the entire meal, including the total price.
     */
    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    /*
     * Adds toppings to the burger in the meal.
     */
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    /*
     * Sets the size of the drink in the meal.
     */
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
