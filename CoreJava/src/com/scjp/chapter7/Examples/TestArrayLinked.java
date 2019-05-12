package com.scjp.chapter7.Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al = new ArrayList<String>();
al.add("Swapna");
al.add("sai");
al.add("Bhargav");
al.add("Sandeep");

List<String> al1= new LinkedList<String>();
al1.add("ramesh");
al1.add("suresh");
al1.add("rajesh");
al1.add("mahesh");

System.out.println("arraylist:"+al);
System.out.println("linkedlist:"+al1);
	}

}
