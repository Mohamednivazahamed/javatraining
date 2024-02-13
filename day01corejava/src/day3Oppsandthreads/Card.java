package day3Oppsandthreads;

public abstract class Card {
	private int cardNo;
	private String expiry;
	private int ccv;
	private String name;
	private int pin;
	private double amount;
	
	
	

	public Card(int cardNo, String expiry, int ccv, String name, int pin, double amount) {
		super();
		this.cardNo = cardNo;
		this.expiry = expiry;
		this.ccv = ccv;
		this.name = name;
		this.pin = pin;
		this.amount = amount;
	}


	public Card() {
		// TODO Auto-generated constructor stub
	}


	public int getCardNo() {
		return cardNo;
	}


	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}


	public String getExpiry() {
		return expiry;
	}


	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}


	public int getCcv() {
		return ccv;
	}


	public void setCcv(int ccv) {
		this.ccv = ccv;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	
	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", expiry=" + expiry + ", ccv=" + ccv + ", name=" + name + ", pin=" + pin
				+ ", amount=" + amount + "]";
	}


	public abstract boolean swipe(double transactionAmount); 
}
