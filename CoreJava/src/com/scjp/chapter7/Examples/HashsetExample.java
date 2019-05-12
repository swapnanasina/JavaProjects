package com.scjp.chapter7.Examples;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a hash set
	      HashSet hs = new HashSet();
	      
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      System.out.println(hs);
	      //cloning
	      hs.clone();
	      System.out.println("cloning hashmap:"+hs);
	      
	     // hs.clear();
	      System.out.println(hs);
	      
	      hs.remove("A");
	     
	      System.out.println("removing index 1:"+ hs);
	   }
	
	}


