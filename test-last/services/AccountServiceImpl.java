package com.tcs.bms.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.bms.resource.Account;
import com.tcs.bms.resource.User;

import com.tcs.bms.respositories.AccountRepository;

public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;
	private String generateUniqueAccountNumber() {
	    String accountNumber;
	    do {
	        // Generate a UUID as the account number
	        accountNumber = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
	    } while (accountRepository.findByAccountNumber(accountNumber) != null);

	    return accountNumber;
	}

	@Override
    public Account createAccount(User user) {
        String accountNumber = generateUniqueAccountNumber();
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setBalance(0.0);
        return accountRepository.save(account);
    }


	
}
