package org.examples;

import java.util.Scanner;

public class AccountTest {
//-------------5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Customer ID");
		int CusId = sc.nextInt();
		sc.nextLine(); //After number we press  enter to go to next line which is considered as a string to avoid this use nextline after every nextint.
		System.out.println("enter Customer Name");
		String CusNam = sc.nextLine();
		System.out.println("enter Customer Email");
		String CusEmaill = sc.nextLine();
		Customer cust = new Customer( CusId, CusNam, CusEmaill);
		
		System.out.println("enter Account Number");
		 int  AccNum = sc.nextInt();
		System.out.println(" enter Account Balance");
		Double AccBal = sc.nextDouble();
		System.out.println("enter Minimum Balance");
		double MinBal = sc.nextDouble();
		
		//Account acc = new SavingAccount1(AccNum, cust, AccBal, MinBal);
		System.out.println("Enter type of account(saving or Checking or LoanAmount): ");
		String accType = sc.next();
		Account acc=AccountFactory.getAccount(accType, AccNum, cust,AccBal, MinBal, MinBal);
		
		if (accType.equalsIgnoreCase("saving")||accType.equalsIgnoreCase("Checking")) {
			System.out.println("withdraw or Deposit: ");
			String withDrowOrDeposit = sc.next();
			if (withDrowOrDeposit.equalsIgnoreCase("withdraw")) {
				System.out.println("Enter the Amount to withdraw: ");
				double amtt = sc.nextDouble();
				if (acc.withdraw(amtt)) {
					System.out.println(" Current Account Balance after withdraw  :"+Account.getBalance());			
				}
			} else if (withDrowOrDeposit.equalsIgnoreCase("deposit")) {
				System.out.println("Enter the Amount to Deposit: ");
				double amtt = sc.nextDouble();
				if (acc.deposit(amtt)) {
					System.out.println(" Current Account Balance  after deposit :"+Account.getBalance());			
				}
			}
			else {
				System.out.println("no option selected ...");
			}			
		}	
		if (accType.equalsIgnoreCase("LoanAmount")) {
			System.out.println("enter Minimum Balance to check your loan");
			double MinBall = sc.nextDouble();
			if (acc.LoanApprove(MinBal)) {
				System.out.println("Account Balance without loan :"+Account.getBalance());			
			}
			
		}

		sc.close();
	}
}
