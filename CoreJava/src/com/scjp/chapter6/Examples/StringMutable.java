package com.scjp.chapter6.Examples;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer sbf = new StringBuffer("Swapna");
   sbf.append(" Nasina");
   sbf.replace(0, 6, "sai");
   
   System.out.println(sbf);
	}

}
