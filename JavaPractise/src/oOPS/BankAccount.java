package oOPS;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phone;

	public BankAccount(int accountNumber, double balance, String customerName, String customerEmail,
			String customerPhone) {
		System.out.println("Constructor with parameters is called");

// If the method parameters have the same names as the class variables, 
// 'this.' is used to differentiate between the method parameters and class variables.
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;

// If the method arguments have different names than the class variables, 
// 'this' is not required.
		email = customerEmail;
		phone = customerPhone;
	}

// Similar to methods, constructors can also be overloaded.
	
	public BankAccount() {
		// If you want to assign default values to the parameters without passing them
		// to the constructor,
		// you can call the overloaded constructor (line 11) as shown below:
		this(56789, 2.50, "Default Name", "Default email", "Default phone");
		// So whenever you declare empty constructor, it takes the default values
		// mentioned here.

		System.out.println("Empty constructor called");
	}

	public BankAccount(String customerName, String email, String phone) {
		// as this constructor only has 3 arguments but we also want to set number and
		// balance to some default values.
		// in that case we will declare as shown below.
		this(12343, 100.55, customerName, email, phone);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void depositFund(int amount) {
		balance += amount;
		System.out.println("Your account has been credited with " + amount + ", new balance is: " + this.balance);
	}

	public void withdrawFund(double amount) {

		double remainingBalance = balance - amount;
		if (remainingBalance < 0) {
			System.out.println("Insufficient balance in your account.");
		} else {
			System.out.println("You have withdrawn " + amount + " from your account.");
			balance -= amount;
			System.out.println("Your updated account balance is: " + balance);
		}

	}
}
