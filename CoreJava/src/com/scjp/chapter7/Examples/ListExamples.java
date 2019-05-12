package com.scjp.chapter7.Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		List a1 = new ArrayList();
		a1.add("Swapna");
		a1.add("sandeep");
		a1.add("bhargav");
		System.out.println("ArrayList elements");
		System.out.println("\t" + a1);
		
		List l1 = new LinkedList();
		l1.add("Swapna");
		l1.add("sandeep");
		l1.add("bhargav");
		System.out.println();
		System.out.println("LinkedList Elements");
		System.out.println("\t" + l1);
	}

}
