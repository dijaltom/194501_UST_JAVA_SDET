package com.ust.test;

class Exception7 extends Exception {
	private static int accno[] = {1001,1002,1003,1004};
	
	private static String name[]= {"nish","subh","abhi","akash"};
	
	private static double bal[]= {10000.0,15550.0,20000.0,30000.0};
	
Exception7(){
		
	}
	
	Exception7(String str){super(str);}
		
	public static void main(String[] args) {
		try {
			System.out.println("Account no: " + "/t" + "Customer name: "+"/t" + "balance");
			for(int i=0;i<5;i++) {
				System.out.println(accno[i] + "/t" +name[i] + "/t" +bal[i]);
			
			if(bal[i]<1000) {
				Exception7 me = new Exception7("Balance is less than 100");
				throw me;
			}
			}
		
				
		

	}catch(Exception7 e) {
		
		e.printStackTrace();

}
}
}
