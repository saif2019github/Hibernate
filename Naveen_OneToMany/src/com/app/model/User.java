package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int userid;
	
	private String firstname;
	
	private String lastname;
	
	private String mobilenumber;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilenumber="
				+ mobilenumber + "]";
	}
	
}
