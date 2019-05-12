package com.scjp.chapter2.Inheritance;

public class Animal1 {
      void eat() {
    	  System.out.println("Animal is eating");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat1 c = new Cat1();
       c.eat();
       c.drink();
       Kitten k = new Kitten();
       k.eat();
       k.drink();
       k.sleep();
       
	}

}

class Cat1 extends Animal1{
	void drink() {
		System.out.println("Cat is drinking");
	}
}

class Kitten extends Cat1 {
	void sleep() {
		System.out.println("Kitten is sleeping");
	}
	
}

