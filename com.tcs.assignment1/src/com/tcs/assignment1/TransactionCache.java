package com.tcs.assignment1;

import java.util.ArrayList;

public class TransactionCache {

	ArrayList<Transaction> translist = new ArrayList<Transaction>();
	
	

	

	public ArrayList<Transaction> getTranslist() {
		return translist;
	}

	public void addTranslist(Transaction translist) {
		this.translist.add(translist);
	}
	
	
	
	
}
