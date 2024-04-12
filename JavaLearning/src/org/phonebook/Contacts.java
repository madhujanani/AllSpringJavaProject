package org.phonebook;

public class Contacts {
	
	private String name;
	private long phonenumber;
	private String email;
	private  String organization;
	public Contacts() {
	}
	public Contacts(String name, long phonenumber, String email, String organization) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.organization = organization;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", phonenumber=" + phonenumber + ", email=" + email + ", organization="
				+ organization + "]";
	}




	




	

}
