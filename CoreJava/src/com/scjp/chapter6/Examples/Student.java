package com.scjp.chapter6.Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	int id;
	String name;
	 transient int age;
	 
	 public Student (int id, String name, int age) {
		 this.id = id;
		 this.name = name;
		 this.age = age;
	 }
	 
	 }

class PersistExample{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student s1 = new Student(21,"swapna",22);
   
  try { 
   
   FileOutputStream f = new FileOutputStream("f.txt");
   ObjectOutputStream out=new ObjectOutputStream(f);  
   out.writeObject(s1);  
   out.flush();  
   
   out.close();  
   f.close();  
   System.out.println("success");  
  }  
  catch(Exception e) {
	  e.printStackTrace();
  }
  try {
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name+" "+s.age);  
	  in.close(); 
  }
  catch(Exception e) {
	  e.printStackTrace();
  }
  }
   
}


