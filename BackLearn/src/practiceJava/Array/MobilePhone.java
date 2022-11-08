package practiceJava.Array;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		//the way to initilise the arraylist
		myContacts = new ArrayList<Contact>();
	}
	
	public Boolean addNewContact(Contact contact) {
		
		if(findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already on file");
			return false;
		}else {
			myContacts.add(contact);
			return true;
		}
	}
	
	public boolean uppdateContact(Contact oldVal, Contact newVal) {
		int foundPosition = findContact(oldVal);
		if(foundPosition < 0) {
			System.out.println(oldVal.getName() + ", was not found.");
			return false;
		}
		int checkNew = findContact(newVal.getName());
		if(checkNew >= 0) {
			System.out.println("Contact is already on file");
			return false;
		}else {
			this.myContacts.set(foundPosition, newVal);
			System.out.println(oldVal.getName() + ", was replaced with " + newVal.getName());
			return true;
		}
	}
	
	public Boolean removeContact(Contact val) {
		int valIndex = myContacts.indexOf(val);
		if(valIndex != -1) {
			myContacts.remove(valIndex);
			return true;
		}
		return false;
	}
	
	private int findContact(Contact contact) {
		return myContacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		for(int i =0; i<this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	public Contact queryContact(String contactName) {
		int number = findContact(contactName);
		if(number < 0) {
			return null;
		}else {
			Contact contact = this.myContacts.get(number);
		return contact;
		}
	}
	
	public void printContacts() {
			for(int i=0; i<this.myContacts.size(); i++) {
				//Contact contact = this.myContacts.get(i);
				System.out.println((i+1)+ "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
			}
		/*
		 * Java considers index starting from 0,1,2...etc the expression which Java agrees upon is index < size. 
		 * */
	}
	
	
}
