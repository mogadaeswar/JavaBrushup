package oopsChallenge;

public class Car {
    
    // Private field to store the description of the car.
    private String description;

    // Constructor to initialize the description of the car.
    public Car(String description) {
        this.description = description;
    }

    // Method to start the engine. Can be overridden in subclasses.
    public void startEngine() {
        System.out.println("Car -> StartEngine");
    }

    // Method to simulate driving the car.
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();  // Calls the runEngine() method
    }

    // Protected method that simulates running the engine. Can be overridden by subclasses.
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends Car {
    
    // Fields specific to GasPoweredCar (average kilometers per liter and cylinder count).
    private double avgKmPerLiter;
    private int cylinder;

    // Constructor that calls the parent (Car) constructor.
    public GasPoweredCar(String description) {
        super(description);
    }

    // Overloaded constructor to initialize description, avgKmPerLiter, and cylinder.
    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    // Override the startEngine method to provide custom behavior for gas-powered cars.
    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinder);
    }

    // Override the runEngine method to provide custom behavior for gas-powered cars.
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {
    
    // Fields specific to ElectricCar (average kilometers per charge and battery size).
    public double avgKmPerCharge;
    public int batterySize;

    // Constructor that calls the parent (Car) constructor.
    public ElectricCar(String description) {
        super(description);
    }

    // Overloaded constructor to initialize description, avgKmPerCharge, and batterySize.
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    // Override the startEngine method to provide custom behavior for electric cars.
    @Override
    public void startEngine() {
        System.out.printf("BEV -> All %d kWh battery is ready!%n", batterySize);
    }

    // Override the runEngine method to provide custom behavior for electric cars.
    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {
    
    // Fields specific to HybridCar (average kilometers per liter, battery size, and cylinder count).
    public double avgKmPerLiter;
    public int batterySize;
    public int cylinder;

    // Constructor that calls the parent (Car) constructor.
    public HybridCar(String description) {
        super(description);
    }

    // Overloaded constructor to initialize description, avgKmPerLiter, batterySize, and cylinder.
    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    // Override the startEngine method to provide custom behavior for hybrid cars.
    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinder);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    // Override the runEngine method to provide custom behavior for hybrid cars.
    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}

