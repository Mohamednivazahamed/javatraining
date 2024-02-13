package day3Oppsandthreads;

public  class MasterdebitCard extends Card{

	public MasterdebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MasterdebitCard(int cardNo, String expiry, int ccv, String name, int pin, double amount) {
		super(cardNo, expiry, ccv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
	
@Override
public  boolean swipe(double transactionAmount) {
	return false;
	
}
	

}
