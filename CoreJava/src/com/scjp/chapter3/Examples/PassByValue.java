package com.scjp.chapter3.Examples;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x = 5;
  change(x);
  System.out.println(x);
  
	}
	public static void change(int x) {
		x= x*2;
	}

}

