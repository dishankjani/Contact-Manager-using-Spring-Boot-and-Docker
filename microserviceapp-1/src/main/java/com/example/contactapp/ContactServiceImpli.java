package com.example.contactapp;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpli implements ContactService {

	//fake database for storing contacts 
	List<Contacts> contacts = List.of(
			new Contacts(1, 1, "maheshbabu", 777),
			new Contacts(2, 1, "sheta", 788),
			new Contacts(3, 2, "xys", 699)
			
			
			);
	
	@Override
	public List<Contacts> getContacts(Integer userid) {
		
		return contacts.stream().filter(contact -> contact.getUserid().equals(userid)).collect(Collectors.toList());
		
	}

}
