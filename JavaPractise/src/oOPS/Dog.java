package oOPS;

// The Dog class inherits from the Animal class.
// It represents a specific type of animal with pre-defined attributes.
public class Dog extends Animal {
    
    // Default constructor for the Dog class.
    // Uses the 'super' keyword to call the parent class (Animal) constructor with predefined values. this 
	// is similar to using this. keyword in constructor
    public Dog() {
        super("Hazel", "Big", 50); 
    }
    
    // Inherited methods like move() and makeNoise() from Animal can be used here as well.
    // If needed, these methods can be overridden for custom behavior specific to Dog.
}
