package com.scjp.chapter2.Examples;

//it is a process of wrapping up data(variables) and code acting on data(methods) together in a single unit
//in encapsulation the variables of a class will be hidden from other classes and can accessed only through the methods of their current class
//to achieve encapsulation define the variables of a class as private.
//provide getter and setter values to modify and view the variables.
//benefits:
//the fields of a class can be made read only or write only.
//a class can have total control over what is stored in its fields


public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p = new Person();
		p.setAge(24);
		p.setIdNum("1223");
		p.setName("swapna");
		System.out.println("NAME:"+p.getName() +"   "  +"   " +   "AGE:"+p.getAge()+ " "   +" "  +      "IDNUM:"+p.getIdNum());
	}

}

class Person{
	private String name;
	private String idNum;
	private int age;
	
	public String getName() {
		return name;
	}
	public String getIdNum() {
		return idNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age= newAge;
	}
	public void setIdNum(String newIdNum) {
		idNum = newIdNum;
	}
	public void setName(String newName) {
		name = newName;
	}
}
