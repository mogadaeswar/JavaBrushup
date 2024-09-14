package oOPsConcepts;

// The Dog class inherits from the Animal class.
// It represents a specific type of animal with pre-defined attributes.
public class Dog extends Animal {
	
	private String earShape;
	private String tailShape;
    
    // Default constructor for the Dog class.
    // Uses the 'super' keyword to call the parent class (Animal) constructor with predefined values. this 
	// is similar to using this. keyword in constructor
    public Dog() {
        super("Hazel", "Big", 50); 
     // Inherited methods like move() and makeNoise() from Animal can be used here as well.
        // If needed, these methods can be overridden for custom behavior specific to Dog.
    }
    
    public Dog(String type, double weight) {
    	this(type,weight, "Bunny", "Curled");
    }
    
	public Dog(String type, double weight, String earShape, String tailShape) {
		super(type, weight <15 ? "small":(weight<35?"medium":"large"), weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return "Dog {"+"earShape='" + earShape + '\''+
				", tailShape='" + tailShape + '\'' +
				"}"+super.toString();
	}
	
	public void makeNoise() {
		if(type=="Wolf") {
			System.out.println("Ow Wooo!");
		}
		bark();
		System.out.println();
	}
	
	public void move(String speed) {
		super.move(speed);
		//System.out.println("Dogs walk, run and wag their tail");
		if(speed == "slow") {
			walk();
			wagTail();
		} else {
			run();
			bark();
		}
		System.out.println();
	}
	
	private void bark() {
		System.out.print("Woof!");
	}
	private void run() {
		System.out.print("Dog Running!");
	}
	private void walk() {
		System.out.print("Dog Walkinng!");
	}
	private void wagTail() {
		System.out.print("Tail Wagging!");
	}

}

    
