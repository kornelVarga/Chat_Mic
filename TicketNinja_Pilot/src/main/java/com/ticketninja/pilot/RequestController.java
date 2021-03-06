package com.ticketninja.pilot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

	// POST request handler for numbers
	@RequestMapping(value = "/addPostNumbs", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PrNumbers> addition(@RequestBody PrNumbers num) {
		System.out.println("I have recieved a GET request!");
		return new ResponseEntity<PrNumbers>(num, HttpStatus.OK);
	}

	/*
	 * // GET request handler for numbers
	 * 
	 * @RequestMapping(value = "/addGetNumbs", method = RequestMethod.GET, produces
	 * = "application/json") public ResponseEntity<ChatFuelDTO>
	 * add(@RequestParam("firstNumber") int first,
	 * 
	 * @RequestParam("secondNumber") int second) { PrNumbers number = new
	 * PrNumbers(first, second); ChatFuelDTO dto=new ChatFuelDTO();
	 * dto.setMessages(); return ResponseEntity<ChatFuelDTO>(dto,HttpStatus.OK); }
	 */

	// Handlers for GET and POST requests to get user info
	// GET request handler
	@RequestMapping(value = "/giveGetUserInfo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getInfo(@RequestParam("userId") String userID,
			@RequestParam("lastName") String lastName, @RequestParam("firstName") String firstName,
			@RequestParam("mail") String mail) {
		// UserInfo uInfo = new UserInfo(userID, lastName, firstName, mail);
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(userID);
		dto.setMessages(lastName);
		dto.setMessages(firstName);
		dto.setMessages(mail);
		// dto.setMessages(uInfo);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}

	// POST request handler
	@RequestMapping(value = "/givePostUserInfo", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UserInfo> PostUserInfo(@RequestBody UserInfo info) {
		return new ResponseEntity<UserInfo>(info, HttpStatus.OK);
	}

	// Request information from organizers
	// Get the name of the organization
	@RequestMapping(value = "/giveGetOrganizationName", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getOrganizationName(@RequestParam("organizationName") String organizationName) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(organizationName);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}
	
	// Get the organizer's address
	@RequestMapping(value = "giveGetOrganisersZipCode", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getOrganisersZipCode(@RequestParam("zip") String zip) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(zip);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/giveGetOrganisersAddress", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getOrganisersAddress(@RequestParam("settlement") String settlement, @RequestParam("street") String street, @RequestParam("houseNumber") String houseNumber) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(settlement);
		dto.setMessages(street);
		dto.setMessages(houseNumber);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}

	// Get the contact's name
	@RequestMapping(value = "giveGetContactsName", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getContactsName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(firstName);
		dto.setMessages(lastName);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}

	// Get the contact's e-mail address
	@RequestMapping(value = "giveGetContactsMail", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getContactsMail(@RequestParam("mail") String mail) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(mail);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}
	
	//Get additional comment from the contact
	@RequestMapping(value = "giveGetContactsComment", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ChatFuelDTO> getContactsComment(@RequestParam("comment") String comment) {
		ChatFuelDTO dto = new ChatFuelDTO();
		dto.setMessages(comment);
		return new ResponseEntity<ChatFuelDTO>(dto, HttpStatus.OK);
	}

}
