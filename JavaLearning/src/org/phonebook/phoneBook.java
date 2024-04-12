package org.phonebook;

import java.util.ArrayList;
import java.util.List;


public class phoneBook {
	

	private List<Contacts>contactList = new ArrayList<>();
	
	public List<Contacts> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contacts> contactList) {
		this.contactList= contactList;
	}
	//Add contact
	public void addContact(Contacts contactObj) {
	contactList.add(contactObj);
	System.out.println("Contact Added");
}
	//view
	public List<Contacts>getAllContacts(){
		return contactList;
		
	}
	//remove
	public boolean removeContact(long phoneNumber) {
		boolean flag=false;
		for (Contacts contact:contactList){
			if (contact.getPhonenumber()==phoneNumber) {
				flag =true;
				contactList.remove(contact);
				System.out.println("Contact removed");

				}
		}
		return  flag;	
	}
	//get the contacts for the given phone number
	public Contacts getContact(long phoneNumber) {
		for (Contacts contact:contactList){
			if (contact.getPhonenumber()==phoneNumber) {
				return contact;
				}			
		}
		return  null;	
	}

}	

	


