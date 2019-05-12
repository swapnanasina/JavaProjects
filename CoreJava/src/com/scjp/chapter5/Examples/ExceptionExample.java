package com.scjp.chapter5.Examples;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int a=20, b=0;
			int c=a/b;
			System.out.println(c);
		}
			
		
		catch(ArithmeticException e) {
			System.out.println("number can't be divided with zero");
			
		}
		finally {
			System.out.println("is alsways executed");
		}
	}

}
