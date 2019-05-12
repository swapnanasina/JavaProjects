package com.scjp.chapter1.Examples;
//public access modifier
//a class,methods,constructor,interface specified with public can be accessed from any other class.
//therefore fields methods,blocks declared inside a public class can be accessed from any class belonging to java Universe.

public class AcessModifiers {
 public int publicVariable;
 public void publicMethod() {
	 
 }
}
//There are four access modifiers in java:1.Default,2.PUblic,3.private,4.Protected
//if we don't specify any modifier to class methods or variables java itself gives default modifier.
//The fields in an interface are implicitly public static final,and the methods in interface are alwyas public
class DefaultClass{
	int defaultVariable;
	
	void defaultMethod() {
		
	}
}

//private access modifier
//methods , constructors, variables declared private can only be accessed within a class
//private modifier is most restrictive modifier and can't be applied to class and interface.
//variable declared private can be accessed outside of the class through getter and setter methods are present in the class.
//using the private access modifier object encapsulates itself and hide the data from outside world

class PrivateAccessModifier{
	private String privateVariable;
	
	public String getPrivateVariable() {
		return this.privateVariable;
		
	}
	
	public void setPrivateVariable(String privateVariable) {
		this.privateVariable = privateVariable;
	}
	
	
}


//protected access modifier
//variables and methods and constructors that are declared as protected can be accesses by its sub class in other package or any class with in the packageof the protected class members class
//protected acess modifier cannot be applied to interface and classes.


class ProtectedModifier{
	protected String protectedVariable;
	
	protected void protectedMethod() {
		
	}
	
}

