package com.scjp.chapter7.Examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap(); 
	      m1.put("paul", "8");
	      m1.put("zara", "31");
	      m1.put("sam", "12");
	      m1.put("jhon", "14");

	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.print("\t" + m1);
	      
	      System.out.println("\t");
	      System.out.println("size of map:" + m1.size());
	      
	      
	     m1.remove("paul");
	     
	     
	     
	     System.out.println("map Elements:"+m1);
	     System.out.println("hashcode"+ m1.hashCode());
	}

}
