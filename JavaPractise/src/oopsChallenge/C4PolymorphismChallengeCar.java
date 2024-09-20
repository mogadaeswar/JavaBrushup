package oopsChallenge;

public class C4PolymorphismChallengeCar {

	public static void main(String[] args) {
		
		Car car = new Car("2022 Acura RDX AWH-Technology Pack");
		runRace(car);
		
		Car rdx = new GasPoweredCar("2022 Acura RDX AWH-Technology Pack", 15.4,10);
		runRace(rdx);
		
		Car tesla = new ElectricCar("2022 Red Tesla model 3", 568,75);
		runRace(tesla);
		
		Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8,8);
		runRace(ferrariHybrid);

	}
    // Method to simulate a race. This method uses polymorphism to handle different car types.
	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}

}
