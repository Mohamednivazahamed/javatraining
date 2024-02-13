package day3Oppsandthreads;

public class CardTransactions {
	
	
	public static void main(String[] args) {
		
		MatserCreditcard c1= new MatserCreditcard(1234,"11/12/1999",223,"Nivaz",2121,10000);
	//	System.out.println(c1);
		
		MasterdebitCard d1 = new MasterdebitCard(1234,"11/12/1999",223,"Nivaz",2121,10000);
		//System.out.println(d1);
		Card card = new MasterdebitCard(1234,"11/12/1999",223,"Nivaz",2121,10000);
		card.swipe(110);
		card = new MatserCreditcard(1234,"11/12/1999",223,"Nivaz",2121,10000);
		card.swipe(110);
		
		
	}

}
