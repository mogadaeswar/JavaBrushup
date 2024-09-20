package oopsChallenge;

public class SalariedEmployee extends Employee {

    // Specific attributes for salaried employees
    double annualSalary;
    boolean isRetired;

    // Constructor for 'SalariedEmployee', calling 'Employee' constructor using 'super'
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);  // Calls the 'Employee' constructor
        this.annualSalary = annualSalary;  // Sets the annual salary
    }

    // Overriding collectPay() method to calculate paycheck
    @Override
    public double collectPay() {
        // Paycheck is calculated by dividing the annual salary by 26 (bi-weekly)
        double paycheck = annualSalary / 26;

        // If retired, adjust pay by 10%, otherwise full paycheck
        double adjustPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustPay;  // Cast the adjusted pay to int (whole number)
    }

    // Method to retire the employee, setting their end date and marking them as retired
    public void retire() {
        terminate("12/12/2024");  // Calls terminate() method from 'Worker'
        isRetired = true;  // Sets retirement status
    }
	
}
