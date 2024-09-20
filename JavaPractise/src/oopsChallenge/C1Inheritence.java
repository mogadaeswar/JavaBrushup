package oopsChallenge;

public class C1Inheritence {

    public static void main(String[] args) {

        // Creating an Employee object
        Employee Eswar = new Employee("Eswar", "01/31/1992", "01/01/2024");

        // Printing Employee details
        System.out.println(Eswar);

        // Calling getAge() method from Worker (inherited by Employee)
        System.out.println("Age = " + Eswar.getAge());

        // Calling collectPay() method (default from Worker, overridden in SalariedEmployee)
        System.out.println("Pay = " + Eswar.collectPay());

        // Creating a SalariedEmployee object
        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2023", 35000);

        // Printing SalariedEmployee details
        System.out.println(joe);

        // Calling collectPay() to get Joe's paycheck
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        // Joe retires and collectPay() is adjusted for retirement
        joe.retire();
        System.out.println(joe);
        System.out.println("Joe's pension = $" + joe.collectPay());
    }

}
