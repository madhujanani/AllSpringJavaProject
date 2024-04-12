package org.examples;

public  abstract class Account{
	//Create an abstract Account class with accountNumber and balance as
	//fields. and a withdraw abstract method.---1
	private  int accountNumber;
	private static double balance;
	private Customer customer;
	 public   boolean withdraw(double amount) {
		return false;
	}
		public boolean deposit(double amtt) {
			// TODO Auto-generated method stub
			return false;
		}
	
	 protected abstract boolean LoanApprove(double minBalLoan);
	
	public Account (int accountNumber,Customer customer,double balance) {
		this.accountNumber=accountNumber;
		this.customer=customer;
		this.balance=balance;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static double getBalance() {
		return balance;
	}
	public void setBalance(double remainder) {
		this.balance = remainder;
	}
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
	

}
