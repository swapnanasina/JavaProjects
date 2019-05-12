package com.scjp.chapter1.Examples;

public abstract class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		System.out.println("constructing an Employee Constructor");
		this.name = name;
		this.address = address;
		this.number = number;
		
	}

	public double comutePay() {
		System.out.println("Inside Employee ComutePay");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("Mailing to check to " + this.name + " "+this.address);
		
	}
	
	public String toString() {
		return name + " " + address + " " + number; 
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
		

	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		number = newNumber;
		
	}
}


class Salary extends Employee{
	private double salary;
	
	public Salary(String name, String address,int number,double salary) {
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	 
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary pay for " + getName());
	      return salary;
	   }
}
 class AbstractDemo {

	   public static void main(String [] args) {
	      Salary s = new Salary("jim", "washington, WA", 3, 3600.00);
	      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	}