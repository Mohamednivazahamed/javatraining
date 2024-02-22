package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.User;
import com.tcs.rest.services.AccountService;
import com.tcs.rest.services.UserService;







@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	AccountService accountService;
	@GetMapping
	public String check() {
		
		return "controller is working good";
	}
	
//	@GetMapping
//	@RequestMapping("/allinvestors")
//	public List<Investor> showAllInvestors(){
//	 return invService.getInvestors();
//	}
//	
	@PostMapping
	@RequestMapping(
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			value="/adduser")
	public User createInvestor(@RequestBody User user) {
		return userService.registerUser(user);
	}
//
	@GetMapping("/userbyaccount/{accno}")
	public User fetchUser(@PathVariable String accno){
		return userService.getUserByAccountNumber(accno);

	}
//	
//	@GetMapping
//	@RequestMapping("/alltransactions")
//	public List<InvTransaction> showAllInvTransactions(){
//	 return invService.getInvTransactions();
//	}
//	
//	@PostMapping
//	@RequestMapping(
//			consumes=MediaType.APPLICATION_JSON_VALUE,
//			produces=MediaType.APPLICATION_JSON_VALUE,
//			value="/addInvTransaction")
//	public String createTransaction(@RequestBody InvTransaction invTransaction) {
//		return invService.performTransaction(invTransaction);
//	}
//	
//	@PutMapping
//	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
//	produces = MediaType.APPLICATION_JSON_VALUE, value = "/modifyinvestor")
//	public Investor updateInvestor(@RequestBody Investor investor) {
//		return invService.update(investor);
//	}
//	
//	@PutMapping
//	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
//	produces = MediaType.APPLICATION_JSON_VALUE, value = "/deleteinvestor")
//	public Investor deleteInvestor(@RequestBody Investor investor) {
//		return invService.delete(investor);
//	}
//}
	
}
