package com.scjp.chapter2.Inheritance;

public class Dog {
    void eat() {
    	System.out.println("dog is eating");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy p = new Puppy();
		p.myMethod();
	}

}

class Puppy extends Dog{
	void eat() {
		System.out.println("puppy is eating");
	}
	public void myMethod() {
		Puppy pup = new Puppy();
		pup.eat();
		super.eat();
	
	}
	
}
