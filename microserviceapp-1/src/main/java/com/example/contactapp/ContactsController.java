package com.example.contactapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apicontacts")
public class ContactsController {

	
	@Autowired
	ContactService cs;
	
	@GetMapping("getcon/{userid}")
	public List<Contacts> getContacts(@PathVariable Integer userid){
		
		return cs.getContacts(userid);
	}
}
