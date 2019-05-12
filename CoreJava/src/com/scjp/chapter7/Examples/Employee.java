package com.scjp.chapter7.Examples;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
int id;
String name;
int age;

Employee(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
}
public int compareTo(Employee emp) {
	if(age==emp.age)
		return 0;
	else if(age>emp.age)
		return 1;
	else
		return -1;
	
}
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> al = new ArrayList<Employee>();
al.add(new Employee(101,"sony",23));
al.add(new Employee(106,"sweety",25));
al.add(new Employee(109,"bunny",29));
al.add(new Employee(104,"arjun",24));

Collections.sort(al);
for(Employee emp:al ) {
	System.out.println(emp.id+ " " + emp.name+ " " + emp.age);
}
	}

}
