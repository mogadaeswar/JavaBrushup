package oopsChallenge;

/*
 * Challenge:
Bill, the owner of a fast-food hamburger restaurant, wants to provide meal options to his customers. A meal consists of a burger, a drink, and a side item. You are tasked with creating an application where Bill can select different types of burgers and add extra toppings, along with drinks and sides. Each meal order should calculate the total price based on selected items, sizes, and extras.

Key requirements:

Meal Structure: A meal should include exactly one burger, one drink, and one side.
Common Meal: There should be a default meal order with a regular burger, small drink, and fries.
Customization: Allow creating meals with different burgers, drinks (size-specific pricing), and sides.
Burgers: Each burger can have a type, base price, and up to three additional toppings with associated prices.
Deluxe Burger: A special deluxe burger should be available with a fixed price and two extra toppings without price alteration.
 */



public class Item {
	// Represents a general item in the meal, such as a drink, side, or topping.

    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM"; // Default size for items like drinks

    //Constructor to create an item with its type, name, and price.

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    //Gets the name of the item, including size if it's a drink or side.

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    //Returns the base price of the item before adjustments.

    public double getBasePrice() {
        return price;
    }

    //Returns the adjusted price based on the size of the item (for drinks).

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    //Sets the size of the item, relevant for drinks.

    public void setSize(String size) {
        this.size = size;
    }

    // Prints the item with its name and price.

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    //Prints the item using its adjusted price (for drinks and sides).
    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
