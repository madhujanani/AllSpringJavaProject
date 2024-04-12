package org.examples;

public  class AccountFactory {
	
	//----------------6
	public static  Account getAccount(String type,int accNum, Customer customer, double balance, double minBalance,double LoanAmount) {
		if (type.equalsIgnoreCase("saving")) {
			return new SavingAccount1(accNum, customer, balance, minBalance);
		}
		else if (type.equalsIgnoreCase("checking")) {
			return new CheckingAccount(accNum, customer, balance, minBalance);
		}
		else if (type.equalsIgnoreCase("LoanAmount")) {
			return new LoanAccount(accNum, customer, balance, LoanAmount,minBalance);
		}
		else {
			return null;
		}	
	} 
}
