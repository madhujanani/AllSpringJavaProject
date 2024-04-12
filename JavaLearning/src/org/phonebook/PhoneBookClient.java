package org.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookClient {

	
	private static final String Object = null;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		phoneBook mainobj = new phoneBook();
		System.out.println("Menu \n1.Add Contacts\n2.Display All Contacts"+
						"\n3.Search by PhoneNumber\n4.Remove a contact"+"\n5.Exit the application");
		System.out.println("Enter your Choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			
			Contacts contacts = new Contacts();
			System.out.println("Enter the name :");
			sc.next();
			contacts.setName(sc.nextLine());
			System.out.println("Enter phone number");
			contacts.setPhonenumber(Long.parseLong(sc.nextLine()));
			System.out.println("Enter Email");
			contacts.setEmail(sc.nextLine());
			System.out.println("Enter organisation");
			contacts.setOrganization(sc.nextLine());
			mainobj.addContact(contacts);
			break;
		}
		case 2: {			
		mainobj.getAllContacts();
		break;

			}
		case 3: {			
			System.out.println("Enter the PhoneNumber:");
			Long  Phnum =  sc.nextLong();
			mainobj.removeContact(Phnum);
			System.out.println("contact Found");
			break;
		}
		case 4: {			
			System.out.println("Enter the PhoneNumber:");
			Long  Phnum =  sc.nextLong();	
			mainobj.removeContact(Phnum);
			System.out.println("contact removed");
			return;
		}
		case 5: {
			System.exit(0);
			System.out.println("outt of...");
		}
		default:
			
		}
			
	}
}
		
	
	

