package com.scjp.chapter2.Inheritance;

public class Animal {

	void eat() {
     System.out.println("Animal is eating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat c = new Cat();
       c.eat();
       c.drink();
	}

}

 class Cat extends Animal{
	 void drink() {
		 System.out.println("cat is drinking");
	 }
	
}
	// inheritance is defined as the process of acquiring the properties of super class by sub class.
 //here in this program sub class acquires the properties of superclass.
 

