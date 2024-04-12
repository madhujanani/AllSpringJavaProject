package org.examples;

public class CheckingAccount extends Account{
	// ---4
	private double minnBalance;

	public CheckingAccount(int accountNumber, Customer customer, double balance,double minnBalance) {
		super(accountNumber, customer, balance);
		this.minnBalance=minnBalance;
	}

	public double getMinnBalance() {
		return minnBalance;
	}

	public void setMinnBalance(double minnBalance) {
		this.minnBalance = minnBalance;
	}

	@Override
	public boolean withdraw(double amount) {		
		System.out.println(" withdrawing from Checking Account.... ");
		if ((getBalance()-amount)>minnBalance) {
			setBalance(getBalance()-amount);
			return true;			
		}
		return false;
	}	
	 public  boolean deposit(double amount) {
		System.out.println(" Depositing into Checking Account.... ");
		 if ((getBalance()-amount)>minnBalance) {
				setBalance(getBalance()+amount);
				return true;			
			}
				setBalance(getBalance()+amount);
				return false;
			}	
	@Override
	protected boolean LoanApprove(double minBalLoan) {
		return false;
	}
}
