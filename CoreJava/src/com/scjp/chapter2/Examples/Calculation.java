package com.scjp.chapter2.Examples;
class My_Calculation {
	int x;
	public void addition(int y, int z) {
		x=y+z;
		System.out.println("The sum of two numbers is = " + x);
	}
	
	public void subtraction(int y , int z) {
		x=y-z;
		System.out.println("The subtraction of two numbers is = " + x);
	}
}
public class Calculation extends My_Calculation {
	
	public void multiplication(int y , int z) {
		x=y*z;
		System.out.println("the multiplication of two numbers is=" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,  b = 30;
		Calculation calculation = new Calculation();
		calculation.addition(a,b);
		calculation.subtraction(a, b);
		calculation.multiplication(a,b);
		

	}

}
