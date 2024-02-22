package com.tcs.bms.services;

import org.springframework.stereotype.Service;

import com.tcs.bms.resource.Account;
import com.tcs.bms.resource.User;
@Service
public interface AccountService {
	public Account createAccount(User user);
}
