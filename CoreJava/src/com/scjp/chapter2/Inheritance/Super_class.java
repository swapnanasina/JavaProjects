package com.scjp.chapter2.Inheritance;

public class Super_class {


		 void method() {
			
			System.out.println("this is super class method");
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
       Sub_class obj = new Sub_class();
       obj.my_method();
       
			
			
		}
}

	

	class Sub_class extends Super_class{
		
		void method() {
			System.out.println("This is sub class method");
		}
		
		public void my_method() {
			//instantiating
			Sub_class sub = new Sub_class();
			
			sub.method();
			super.method();
			
			
		}
	}
	//super keyword is used to differentiate the members of superclass from the members of subclass if they have same names.

