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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	// Creating the result string that the Chatfuel can handl
	public String toChatFuel() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\r\n");
		builder.append(" \"messages\": [\r\n");
		builder.append("   {\"text\": \"Your information:\"},\r\n");
		builder.append("   {\"text\": \"Last name: ");
		builder.append(lastName);
		builder.append("\"},\r\n");
		builder.append("   {\"text\": \"First name: ");
		builder.append(firstName);
		builder.append("\"},\r\n");
		builder.append("   {\"text\": \"Mail: ");
		builder.append(mail);
		builder.append("\"}\r\n");
		builder.append(" ]\r\n");
		builder.append("}");
		return builder.toString();
	}
}