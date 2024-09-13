package oOPS;

// Main class to test the Animal and Dog classes, demonstrating inheritance.
public class Topic5Inheritance {
    
   public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal", "Huge", 400);    
        // Call the helper method doAnimalStuff() to demonstrate the actions of this animal.
        doAnimalStuff(animal, "slow");
        
        // Create an instance of Dog, which automatically has the attributes
        // defined in its constructor (Hazel, Big, 50).
        Dog dog = new Dog();
        
        // Call the helper method again, this time for the Dog object with a different speed.
        doAnimalStuff(dog, "fast");
    }

    // Helper method to demonstrate the actions of any Animal object.
    // It calls the makeNoise() and move() methods and prints the animal's details.
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
