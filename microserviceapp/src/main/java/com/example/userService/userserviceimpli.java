package com.example.userService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class userserviceimpli implements UserService {

	//as we are practicing microservices we wont use the real database instaed we create a sample list which acts as a database
	List<User> users = List.of(
			new User("Dishank", 1L),
			new User("abcs", 2L),
			new User("mahed", 3L)
			);
	
	@Override
	public User getUser(Long userid) {
		
		//we can use equals on objects only, thus instead of long which is datatype we use Long object which is a object for long datatype
		return users.stream().filter(user -> user.getUserid().equals(userid)).findAny().orElse(null);
	}

}
