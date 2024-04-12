package org.examples;

public class LoanAccount extends Account {
	//-----------------7
	
	private double LoanAmount;
	private double minBalance;
	
	public LoanAccount(int accountNumber, Customer customer, double balance,double LoanAmount,double minBalance) {
		super(accountNumber, customer, balance);
		this.LoanAmount=LoanAmount;
		this.minBalance=minBalance;
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	public  boolean LoanApprove(double amount) {
		 if (minBalance>1000) {
				double loanAmtt=(minBalance*50);
				double total=loanAmtt+getBalance();
				System.out.println("you are Approved for a Loan Amount of :"+loanAmtt);
				System.out.println("your total balance with loan :"+total);
				//return true;			
			}else {
				System.out.println("Minimum balance should be more then $1000");
			}
			return false;
		}
}
