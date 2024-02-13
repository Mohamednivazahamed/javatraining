package com.tcs.assignment2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvTransaction  {
	@Id
	int transId;
	double transAmount;
	int transMakerID;
	
	
	public InvTransaction() {
		super();
	}

	public InvTransaction(int transId, double transAmount, int transMakerID) {
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
	
	boolean performTransaction(Investor i) {
		//get Investors Balance
		double existingbaal = i.getAvaialableBalance() ;
		//compare investor balance with transbalence 
		if(existingbaal >transAmount) {
		i.setAvaialableBalance(existingbaal-transAmount);
		return true;
		}
		else {
			System.out.println("cant perform this transaction");
		return false;	
		}
	}
	
	
	
	
	

}
