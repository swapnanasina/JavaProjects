package com.scjp.chapter1.Examples;

public abstract class AbstractAnimal {

	void walk() {
		System.out.println("animals walk with four legs");
	}
	
	abstract void eat();
	abstract void sleep();
	abstract void run();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractAnimal r = new Rabbit();
		r.walk();
		r.eat();
		r.sleep();
		r.run();
		

	}

}

class Rabbit extends AbstractAnimal{
	
	public void eat() {
		System.out.println("rabbits eat carrots");
	}
	
	public void sleep() {
		System.out.println("rabbits sleep in bushes");
	}
	public void run() {
		System.out.println("rabbits runs very fast");
	}
}