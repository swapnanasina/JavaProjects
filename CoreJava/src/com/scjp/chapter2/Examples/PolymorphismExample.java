package com.scjp.chapter2.Examples;
//the ability of an object to take on many forms is known as polymorphism.
//it is a concept where parent class object is referred to child class
//if an object that can pass more than one IS-A property is considered to be as polymorphism.
//in java all the objects comes under polymorphism.
//it is important to know that objects can be accessed only through reference variables.
//reference variable one declared its value cannot be changed.

class Animal implements Vegetarian{
	public void eat() {
		System.out.println("Animals also eats vegetarian");
	}
}

class Deer extends Animal implements Vegetarian{
	public void eat() {
		System.out.println("Deer eats Vegetarian food");
	}
	
}


	
public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deer d = new Deer();
        d.eat();
		Animal da = new Deer(); //deer is-a animal
		da.eat();
		Vegetarian v = new Animal();//animal is-a vegetarian
		v.eat();
		Animal a = new Animal();
		a.eat();
	}

}

	
