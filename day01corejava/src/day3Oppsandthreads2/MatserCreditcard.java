package day3Oppsandthreads2;

public class MatserCreditcard extends Card {

	
public MatserCreditcard() {
		super();
		// TODO Auto-generated constructor stub
	}

public MatserCreditcard(int cardNo, String expiry, int ccv, String name, int pin, double amount) {
		super(cardNo, expiry, ccv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

@Override
public boolean swipe(double transactionAmount) {
	// TODO Auto-generated method stub
	System.out.println("I'm in credit ");
	return true;
}
	
}
