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
	private String res;
	//private String userID, firstName, lastName, mail;
	private PrNumbers number;
	private UserInfo uInfo;
	
	//POST request handler for numbers
	@RequestMapping(value="/addPostNumbs", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<String> addition(@RequestBody PrNumbers num){
		number=num;
		//Creating the result string that the Chatfuel can handl
		System.out.println("I have recieved a GET request!");
		res="{\"messages\":[{\"result\":"+num.addition()+"}]}";
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	
	//GET request handler for numbers
	@RequestMapping(value="/addGetNumbs", method=RequestMethod.GET, produces="application/json")
	public String add(@RequestParam("firstNumber") int first, @RequestParam("secondNumber") int second){
		number=new PrNumbers();
		number.setFirstNumber(first);
		number.setSecondNumber(second);
		//Creating the result string that the Chatfuel can handl
		
		String result="{\r\n" + 
				" \"messages\": [\r\n" + 
				"   {\"text\": \"The result:\"},\r\n" + 
				"   {\"text\": \""+number.addition()+"\"}\r\n" + 
				" ]\r\n" + 
				"}";
		return result;
	}
	
	//GET request handler for numbers to get back numbers
	@RequestMapping(value="/getNumbs", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> get(){
				
		return new ResponseEntity<String>(res,HttpStatus.OK);
}
//Handlers for GET and POST requests to get user info 
	//GET request handler
	@RequestMapping(value="/giveUserInfo", method=RequestMethod.GET, produces="application/json")
	public String getInfo(@RequestParam("userId") String userID, @RequestParam("lastName") String lastName,
	@RequestParam("firstName") String firstName, @RequestParam("mail") String mail ) {
		uInfo=new UserInfo();
		uInfo.setUserID(userID);
		uInfo.setLastName(lastName);
		uInfo.setFirstName(firstName);
		uInfo.setMail(mail);
		//Creating the result string that the Chatfuel can handl
		String result="{\r\n" + 
				" \"messages\": [\r\n" + 
				"   {\"text\": \"Your mail was:\"},\r\n" + 
				"   {\"text\": \""+uInfo.getMail()+"\"}\r\n" + 
				" ]\r\n" + 
				"}";
		return result;
	}
	@RequestMapping(value="/addUserInfo", method=RequestMethod.POST, produces="application/json")
	public String PostUserInfo(@RequestBody UserInfo info){
		//uInfo=info;
		String result="{\r\n" + 
				" \"messages\": [\r\n" + 
				"   {\"text\": \"Your mail was:\"},\r\n" + 
				"   {\"text\": \""+info.getMail()+"\"}\r\n" + 
				" ]\r\n" + 
				"}";
		return result;
	}
	//GET request handler for numbers to get back numbers
	@RequestMapping(value="/getUserInfo", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> getUserInfo(){
				
		return new ResponseEntity<String>(res,HttpStatus.OK);
}
	
}
