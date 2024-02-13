package day3Oppsandthreads2;

import java.io.*;

public class CardTransactions {
	public static Exception readyda(RuntimeException r) throws Exception{
		if (r ==null) {
			throw new Exception("varata");
		}
		else {
			return new ArithmeticException("hello");
		}
	}
	
	public static void main(String[] args) {
//		CardIface c1;
//		c1= new MatserCreditcard(1234,"11/12/1999",223,"Nivaz",2121,10000);
//		//System.out.println(c1);
//		
//		
//		MatserCreditcard m1 = (MatserCreditcard) c1;
//		
//		System.out.println(m1.getAmount());
		
//		MatserCreditcard c1= new MatserCreditcard(1234,"11/12/1999",223,"Nivaz",2121,10000);
//	//	System.out.println(c1);
//		
//		MasterdebitCard d1 = new MasterdebitCard(1234,"11/12/1999",223,"Nivaz",2121,10000);
//		//System.out.println(d1);
//		Card card = new MasterdebitCard(1234,"11/12/1999",223,"Nivaz",2121,10000);
//		card.swipe(110);
//		card = new MatserCreditcard(1234,"11/12/1999",223,"Nivaz",2121,10000);
//		card.swipe(110);
//		try {
//			int a=10/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("exception");
//		}
		
	//	FileInputStream fis= new FileInputStream("");
		try {
		Exception temp= 	readyda( new RuntimeException());
		
		System.out.println(temp.getMessage());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("from finally block");
		}
	}

}
