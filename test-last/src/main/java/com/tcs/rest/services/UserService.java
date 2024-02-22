package com.tcs.rest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.resource.Account;
import com.tcs.rest.resource.User;
import com.tcs.rest.respositories.UserRepository;



@Service
public class UserService{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	AccountService accountService;
	
	

	public User registerUser(User user) {
		

        // Save the user details
        User savedUser = userRepository.save(user);

        // Create an account for the user
        Account account = accountService.createAccount(savedUser);

        savedUser.setAccount(account);
        userRepository.save(savedUser);
        
        System.out.println(savedUser.getAccount().getAccountNumber());
        System.out.println(account.getUser().getName());

        
        return savedUser;
		
	}


	public User getUserByAccountNumber(String account_no) {
		// TODO Auto-generated method stub
		return userRepository.findByAccountAccountNumber(account_no);
	}


	public User updateUser(User user) {
		
		return null;
		
	}

	


}
