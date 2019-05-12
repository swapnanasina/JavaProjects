package com.scjp.chapter1.Examples;

// A class is a template/blueprint that describes the state/behavior that the object of its type support.

public class MyClass {//CLASS DECLARATION
  String name;//VARIABLE DECLARATION
  int id;
  String address;
   
  MyClass(){ //CONSTRUCTOR
	  name = "Swapna";
	 id = 100;
	 address = "Bellevue";
	 
  }
  
  void print() {    //METHOD DECLARATION
	  System.out.println("name = "+ name +" " + "id = "+ id+" "+ "address = "+ address );
  }
  
}
class Execute{
	public static void main(String args[]) {//MAIN METHOD
		MyClass mc = new MyClass();//CREATING NEW OBJECT OR CREATING AN INSTANCE OF CLASS
		mc.print();
	}
}



