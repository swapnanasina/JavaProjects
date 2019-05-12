package com.scjp.chapter7.Examples;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList a1 = new ArrayList();
  System.out.println("intial size pf a1:"+ a1.size());
  
  a1.add("C");
  a1.add("B");
  a1.add("E");
  a1.add("F");
  a1.add("A");
  a1.add("D");
  a1.add(1,"A2");
  System.out.println("size of a1 after additions:" +a1.size());
  
  //arrayList
  System.out.println("contents of a1:" +a1);
  
  //remove elements from the array list
  
  a1.remove("F");
  a1.remove(2);
  System.out.println("size of a1 after deletions:"+a1.size());
  System.out.println("contents of a1:"+a1);
  
  
  
	}

}
