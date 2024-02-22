package com.tcs.bms.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bms.resource.Account;
import com.tcs.bms.resource.User;


import com.tcs.bms.respositories.UserRepository;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	AccountService accountService;
	
	
	@Override
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

	@Override
	public User getUserByAccountNumber(String account_no) {
		// TODO Auto-generated method stub
		return userRepository.findByAccountAccountNumber(account_no);
	}

	@Override
	public User updateUser(User user) {
		
		return null;
		
	}

	


}
