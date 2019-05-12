package com.scjp.chapter7.Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Students {

	private int id;
	private String name;
	
	public Students(int id, String name) {
		this.name = name;
		this.id = id;
		
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}


}

 class HashcodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Students swapna1 = new Students(1,"Swapna");
    Students swapna2 = new Students(1,"swapna");
    
    System.out.println("swapna1 hashcode=" + swapna1.hashCode());
    System.out.println("swapna2 hashcode=" + swapna2.hashCode());
    
    System.out.println("checking equality between swapna1 and swapna2 =" + swapna1.equals(swapna2));
    
    //EQUALS() WITH ARRAYLIST
    Students swapna = new Students(1,"swapna");
    
    List<Students> studentslist = new ArrayList<Students>();
    studentslist.add(swapna);
    
    System.out.println("arraylist size =" + studentslist.size());
    System.out.println("Arraylist contains alex = " + studentslist.contains(new Students(1,"swapna")));
    
	}



}
