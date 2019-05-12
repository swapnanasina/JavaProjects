package com.scjp.chapter8.Examples;

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer_class outer_class = new Outer_class();
      outer_class.display_InnerClass();
      Outer_class.Inner_class inner = outer_class.new Inner_class();
	}

}


class Outer_class{
	int i;
	
	class Inner_class{
		public void print() {
			System.out.println("This is Inner Class");
		}
	}
	
	void display_InnerClass() {
		Inner_class innerClass = new Inner_class();
		innerClass.print();
		
	}

	
	}
