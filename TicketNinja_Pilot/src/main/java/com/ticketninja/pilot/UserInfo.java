package com.ticketninja.pilot;

public class UserInfo {
	private String userID;
	private String lastName;
	private String firstName;
	private String mail;
	
	public UserInfo(String userID, String lastName, String firstName, String mail) {
		this.userID = userID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.mail = mail;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMail() {
		return mail;
	}
	
	
}