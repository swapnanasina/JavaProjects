package com.scjp.chapter7.Examples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList l1 = new LinkedList();
		
		l1.addFirst("A");
		l1.add("D");
		l1.add("F");
		l1.add("B");
		l1.add("E");
		l1.add("C");
		l1.addLast("Z");
		l1.add("1,A2");
		
		System.out.println("Original contents of l1:" +l1);
		
		//removing elements from linkedlist
		l1.remove("F");
		l1.remove(2);
		System.out.println("contents of l1 after deletion:" +l1);
		
		//removing first and last elements
		l1.removeFirst();
		l1.removeLast();
		System.out.println("after removing first and last elements:" +l1);
		
		//get and set values
		Object val = l1.get(2);
		l1.set(3, val);
		System.out.println("after getter and setter methods:" +l1);
		
		
		Object val1 = l1.getFirst();
		l1.set(3, val1);
		System.out.println(l1);
		
		
		int size = l1.size();
		System.out.println(size);
		
		
		l1.toArray();
		System.out.println(l1);
		
		
	l1.clone();
	System.out.println(l1);
		
		
		
	
		
		

	}

	

}
