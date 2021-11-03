package org.testing;

public class Son extends Father {
	
	private void mul() {

		
		System.out.println("mul");
	}
	
	public static void main(String[] args) {
		
		Son s=new Son() ;
		
		
		s.mul();
		s.sub();
		s.add();
		
		
	}


}
