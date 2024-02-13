package com.tcs.oops1;

public class firstProgram {

	public static void main(String[] args) {
		int total = 1100; 
		int subjects =6;
		
		int avg_mark =  100/6;
		
		if (avg_mark >90) {
			System.out.println("B+");
		}
		int start=0;
		int stop =100;
		
//		while (start<=stop) {
//			System.out.println("Run = "+start);
//		start++;
//			
//		}
//		for(;start<=stop;start++) {
//			System.out.println("Run = "+start);
//		}
//	int flag=0, sum=0;
//		for(stop = 6;stop>start;stop--) {
//			flag++;
//			//System.out.println("Else " +flag);
//	
//		sum+=stop;
//		
//			if(flag%3==0 ) {
//			System.out.println("Run = "+sum);
//			//System.out.println("if" +flag);
//			flag=0;
//			sum=0;	
//		}
//			
//				
//			
//	}
		 float principal  =1000000;
		 int  n=25;
		 for (int i=1;i<=n;i++) {
			 principal = principal + (principal*13/100) ;
			 System.out.println(principal);
		 }
		 System.out.println(principal);
	}
}

