package com.scjp.chapter4.Examples;

public class BitwiseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 10;
      int b = 15;
      int c = 0;
      
      
      c = a & b;        
      System.out.println("a & b = " + c );

      c = a | b;        
      System.out.println("a | b = " + c );

      c = a ^ b;        
      System.out.println("a ^ b = " + c );

      c = ~a;           
      System.out.println("~a = " + c );

      c = a << 2;       
      System.out.println("a << 2 = " + c );

      c = a >> 2;       
      System.out.println("a >> 2  = " + c );

      c = a >>> 2;    
      System.out.println("a >>> 2 = " + c );
   
	}

}
