package com.gems.codingtrain.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	
	
	private Map<String,String> contacts=new HashMap<>();
	
	public void addContact(String name, String phoneNumber) {
		if(!contacts.containsKey(name))
		contacts.put(name, phoneNumber);
		
	}
	
	public List<String> getallContact() {
		return new ArrayList<>(contacts.keySet());
		
	}
	
	public void delete(String name) {
		contacts.remove(name);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phonebook=new PhoneBook();
		
		phonebook.addContact("geethu", "09865567");
		phonebook.addContact("mathew", "09865567");
		System.out.println("geth the phone nukneber" +phonebook.getallContact());
		phonebook.delete("geethu");
		System.out.println(phonebook.getallContact());

	}

}
