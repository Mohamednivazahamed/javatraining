package com.tcs.bms.services;

import org.springframework.stereotype.Service;

import com.tcs.bms.resource.User;
@Service
public interface UserService {
	public User registerUser(User user);

	User getUserByAccountNumber(String account_no);

	User updateUser(User user);
}
