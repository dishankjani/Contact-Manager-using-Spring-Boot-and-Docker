package com.example.userService;

import java.util.ArrayList;
import java.util.List;


public class User {

	public String name;
	public Long userid;
	public List<Contacts> contacts = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public List<Contacts> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}
	
	public User(String name, Long userid, List<Contacts> contacts) {
		super();
		this.name = name;
		this.userid = userid;
		this.contacts = contacts;
	}
	public User(String name, Long userid) {
		super();
		this.name = name;
		this.userid = userid;
	}
	
	
	
	
}
