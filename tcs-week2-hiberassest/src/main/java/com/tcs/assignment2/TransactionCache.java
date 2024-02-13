package com.tcs.assignment2;

import java.util.ArrayList;

public class TransactionCache {

	ArrayList<InvTransaction> translist = new ArrayList<InvTransaction>();
	
	

	

	public ArrayList<InvTransaction> getTranslist() {
		return translist;
	}

	public void addTranslist(InvTransaction translist) {
		this.translist.add(translist);
	}
	
	
	
	
}
