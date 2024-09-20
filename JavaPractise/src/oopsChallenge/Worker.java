package oopsChallenge;

public class Worker {

    // Private attributes (cannot be accessed directly outside this class)
    private String name;
    private String birthDate;

    // Protected attribute (accessible by child classes or within the same package)
    protected String endDate;

    // Constructor to initialize 'name' and 'birthDate'
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Default constructor (no arguments)
    public Worker() {}

    // Method to calculate the worker's age using their birth year
    public int getAge() {
        int currentYear = 2025; // Assume current year for calculation
        // Extract the year from birthDate by assuming that date format would be 01/01/1992 (last 4 digits)
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear); // Return the age
    }

    // Placeholder method for collecting pay (can be overridden by subclasses)
    public double collectPay() {
        return 0.0;
    }
    
    // Method to terminate the worker and set the end date
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    // Overriding the toString() method to print worker details
    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ","
                + " endDate=" + endDate + "]";
    }
}
