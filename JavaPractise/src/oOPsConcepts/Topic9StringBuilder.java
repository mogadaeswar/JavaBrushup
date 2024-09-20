package oOPsConcepts;

public class Topic9StringBuilder {

	public static void main(String[] args) {
		
		// Using String: Strings are immutable, meaning once created, their values cannot be changed
        String helloWorld = "Hello" + " World";  
        helloWorld.concat(" and Goodbye");  // This does not modify the original string
        
        // Note: You need to assign the result of 'concat()' to a new variable or the same variable
        // Example: helloWorld = helloWorld.concat(" and Goodbye");
        
        // Using StringBuilder: StringBuilder is mutable, meaning you can modify the same object
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");  // Appends to the same StringBuilder object
		
		printInformation(helloWorld);
		printInformation(helloWorldBuilder);
		
		// Creating a StringBuilder with default capacity (initial capacity is 16 + content length after appending)
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));  // Appending 17 'a' characters
        
        // Creating a StringBuilder with an explicit capacity of 32
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));  // Appending 17 'a' characters

        // Print information about both StringBuilders
        printInformation(emptyStart);  // Default capacity will increase as needed
        printInformation(emptyStart32);  // Initial capacity is 32
		
		
        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        
	}
	
	public static void printInformation(String string) {
		System.out.println("String = "+ string);
		System.out.println("length = "+ string.length());
	}

	public static void printInformation(StringBuilder builder) {
		System.out.println("StringBuilder = "+ builder);
		System.out.println("length = "+ builder.length());
		System.out.println("Capacity = "+builder.capacity());
	}
}
