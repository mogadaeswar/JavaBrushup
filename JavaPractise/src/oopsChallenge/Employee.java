package oopsChallenge;

public class Employee extends Worker {

    // Employee-specific attributes
    private long employeeId;
    private String hireDate;

    // Static variable to keep track of employee numbers (shared across all instances)
    private static int employeeNo = 1;

    // Constructor for 'Employee', invoking the 'Worker' constructor using 'super'
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);  // Calls the parent class (Worker) constructor
        this.employeeId = Employee.employeeNo++;  // Assigns and increments employee ID
        this.hireDate = hireDate;  // Sets hire date
    }

    // Overriding the toString() method to include employee details and worker details
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + ", toString()=" + super.toString()
                + "]";
    }
	
	
}
