package oOPsConcepts;

public class Topic2Constructor {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		user1.setCustomerName("Eswar");
		user1.setAccountNumber(001166234);
		user1.setPhone("+919866939252");
		user1.setEmail("eswar.mogada112@yahoo.co.in");
		user1.setBalance(1000);
		user1.withdrawFund(100.00);
		user1.depositFund(250);
		user1.withdrawFund(50);
		
		/*
		 * it is always difficult to add the data using setters of the parameters are more. the code is very repeat
		 * here the constructor topic comes into picture. Refer BankAccount class.
		 */
		
		/*
		 * now I can add the user details in a single line with help of constructors
		 */
		
		BankAccount bobsAccount = new BankAccount(112345, 1000.00,"Bob",
				"myemail@bob.com", "(848)-347-5423");
		System.out.println(bobsAccount.getAccountNumber());
		System.out.println(bobsAccount.getBalance());
		bobsAccount.withdrawFund(100.00);
		bobsAccount.depositFund(250);
		bobsAccount.withdrawFund(50);
		
		BankAccount divAccount = new BankAccount("Div", "div@user.com", "998595849");
		System.out.println("Account number "+ divAccount.getAccountNumber()+ 
				" belongs to: "+divAccount.getCustomerName());

	}

}
