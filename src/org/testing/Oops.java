package org.testing;

public class Oops {

	private void add() {
		
		int a = 10 ;
		int b = 20 ;
		
		int sum = a+b ;
		System.out.println(sum);
	}
	
	
	
	
	private void sub() {
		
		int a = 10 ;     //10
		int b  =  a;      //10
		
		int s = a-b ;

		System.out.println(s);
	}
	
	private void mul() {

		System.out.println("mul");
	}
	
	
	public static void main(String[] args) {
		
		//cn rn =new cn();
		
		Oops demo = new Oops();
		
		demo.sub();
	}
	
}
