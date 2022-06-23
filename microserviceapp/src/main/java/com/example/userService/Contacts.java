package com.example.userService;

//Note: we are using this contact class just for creating Contacts List in User Entity, we actually get the contacts from Contact class of another microsrevice


public class Contacts {

	public int cid;
	public int userid;
	public String cname;
	public int phonenum;
	
	public Contacts(int cid, int userid, String cname, int phonenum) {
		super();
		this.cid = cid;
		this.userid = userid;
		this.cname = cname;
		this.phonenum = phonenum;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	
	
}
