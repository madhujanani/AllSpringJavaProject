package org.examples;

public class SavingAccount1 extends Account {
	/*SavingsAccount class will extend Account class and have minBalance
	as it's field. This class should implement the withdraw method.---3*/
	
	private double minBalance;
	
	public SavingAccount1(int accountNumber, Customer customer, double balance, double minBalance) {
		super(accountNumber, customer, balance);
		this.minBalance=minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	@Override
	public boolean withdraw(double amount) {		
		System.out.println(" withdrawing from Saving Account.... ");
		if ((getBalance()-amount)>minBalance) {
			setBalance(getBalance()-amount);
			return true;			
		}
		return false;
	}
	
	 public  boolean deposit(double amount) {
		System.out.println(" Depositing into Saving Account.... ");
		 if ((getBalance()-amount)>minBalance) {
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
