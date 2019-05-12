package com.scjp.chapter2.Examples;

//overriding is defined as sub class overrides the methods provided in the superclass
//method overriding is runtime concept.
//a sub class can implement superclass methods based on its requirements
//method overriding is an runtime polymorphism.
//return type must be same.
public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      College c = new School();
      c.PlayGround();
      c.Students();
	}

}

class College{
	public void PlayGround() {
		System.out.println("College has big playground");
	}
	public void Students() {
		System.out.println("College has around 10000 students");
	}
}

class School extends College{
	public void PlayGround() {
		System.out.println("school has small playground");
	}
	public void Students() {
		System.out.println("School has 1000 Students");
	}
}