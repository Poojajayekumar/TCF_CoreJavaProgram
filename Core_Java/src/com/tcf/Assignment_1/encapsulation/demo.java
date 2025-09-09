package com.tcf.Assignment_1.encapsulation;

public class demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BankAccount account = new BankAccount("12345", "Pooja", 1000.0);

	        // Display initial details
	        account.displayAccountInfo();

	        // Deposit money
	        account.deposit(500.0);

	        // Withdraw money
	        account.withdraw(200.0);

	        // Try withdrawing more than balance
	        account.withdraw(2000.0);

	        // Display final details
	        account.displayAccountInfo();

	}


}
