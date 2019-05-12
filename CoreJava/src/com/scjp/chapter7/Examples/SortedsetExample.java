package com.scjp.chapter7.Examples;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      // Create the sorted set
		      SortedSet set = new TreeSet(); 

		      // Add elements to the set
		      set.add("b");
		      set.add("c");
		      set.add("a");
		      set.add("e");
		      set.add("z");
		      set.add("l");

		      // Iterating over the elements in the set
		      Iterator it = set.iterator();

		      while (it.hasNext()) {
		         // Get element
		         Object element = it.next();
		         System.out.println(element.toString());
		      }
		      System.out.println("the first element is:" + set.first());
		      System.out.println(set.last());
		   
		   }
	}

//sorted set interface extends set and declares behavior of set in sorted ascending order
