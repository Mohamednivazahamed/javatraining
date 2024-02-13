package com.tcs.assignment2;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investor {
	@Id
	int investorId;
	String investorName;
	double amountInvested; 
	double avaialableBalance;
	
	public Investor() {
		super();
	}

	public Investor(int investorId, String investorName, double amountInvested, double avaialableBalance) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.amountInvested = amountInvested;
		this.avaialableBalance = avaialableBalance;
	}

	public int getInvestorId() {
		return investorId;
	}

	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public double getAvaialableBalance() {
		return avaialableBalance;
	}

	public void setAvaialableBalance(double avaialableBalance) {
		this.avaialableBalance = avaialableBalance;
	}

	@Override
	public String toString() {
		return "InvestorClass [investorId=" + investorId + ", investorName=" + investorName + ", amountInvested="
				+ amountInvested + ", avaialableBalance=" + avaialableBalance + "]";
	}
	
	
	
	
	

}
