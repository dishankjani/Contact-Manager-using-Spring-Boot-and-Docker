package com.example.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/apiuser")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@Autowired
	RestTemplate resttemplate;

	@GetMapping("/{userid}")
	public User getUsers(@PathVariable Long userid){
	
		User user = userservice.getUser(userid);
		
		//thus now end user is completely unaware of the Contacts service, we internally call it using the Rest APi URI
		//Contact-Service is the name of the application of contacts which is simply localhost:9002
		List contacts = resttemplate.getForObject("http://CONTACT-SERVICE/apicontacts/getcon/"+userid, List.class);
		
		user.setContacts(contacts);
		
		return user;
		
		//if we type url as http://localhost:9001/apiuser/1 we will get User object of dishank
	}
}
