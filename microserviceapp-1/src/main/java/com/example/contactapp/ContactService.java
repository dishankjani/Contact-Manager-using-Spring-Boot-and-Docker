package com.example.contactapp;

import java.util.List;

public interface ContactService {

	//one user can have muttiple contacts so we keep list of contact id as return type
	public List<Contacts> getContacts(Integer userid);
}
