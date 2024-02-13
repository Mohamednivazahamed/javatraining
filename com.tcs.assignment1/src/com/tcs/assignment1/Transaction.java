package com.tcs.assignment1;

public class Transaction extends InvestorClass {
	int transId;
	double transAmount;
	int transMakerID;
	
	
	public Transaction() {
		super();
	}

	public Transaction(int transId, double transAmount, int transMakerID) {
		super();
		this.transId = transId;
		this.transAmount = transAmount;
		this.transMakerID = transMakerID;
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public int getTransMakerID() {
		return transMakerID;
	}

	public void setTransMakerID(int transMakerID) {
		this.transMakerID = transMakerID;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", transAmount=" + transAmount + ", transMakerID=" + transMakerID
				+ "]";
	} 
	
	void performTransaction(InvestorClass i) {
		double existingbaal = i.getAvaialableBalance() ;
		i.setAvaialableBalance(existingbaal-transAmount);
	}
	
	
	
	
	

}
