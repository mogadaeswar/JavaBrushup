package oopsChallenge;

//Represents a burger, which can have a base price and up to 3 extra toppings.

public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    //Constructor to create a burger with a specific name and price.

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    //Overrides the getName method to add "BURGER" to the name.

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    //Calculates the total price of the burger, including any extra toppings.

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    //Determines the price for specific toppings based on their type.

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    //Adds up to three toppings to the burger.

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
    }

    //Prints the itemized list of the burger and its toppings.

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    //Prints the burger and its total price, including toppings.

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
