package com.scjp.chapter2.Examples;
//method overloading is defined as the methods in a class with same name but with different input parameters
public class OverLoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Operations o  = new Operations() ;
		o.sum(10,20);
		o.sum(10,20,30);
		}
	

}

class Operations{
	int a;
	public void sum(int x,int y) {
		a=x+y;
		System.out.println(x+y);
		
	}
	public int sum(int x, int y, int z) {
		a=x+y+z;
		System.out.println(x+y+z);
		return a;
		
	}
}
//method overloading increases the readability of the program.
//method overloading is performed with in the class.
//the return type can vary but with same method name with different input parameters is allowed in the method overloading.
