package org.examples;

public class Customer {
	
	//Account class will have association with Customer class.
	//Customer class will have custId, custName and custEmail fields.---2
	private int custId;
	 private String cusName;
	 private String  custEmail;	
	 
	 public Customer (int custId,String cusName,String  custEmail) {
		 this.custId=custId;
		 this.cusName=cusName;
		 this.custEmail=custEmail;
		 
	 }
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	

}
