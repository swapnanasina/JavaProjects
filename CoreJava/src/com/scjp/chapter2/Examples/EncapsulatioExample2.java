package com.scjp.chapter2.Examples;

public class EncapsulatioExample2 {
	 private String name;
	   private String idNum;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( String newId) {
	      idNum = newId;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulatioExample2 encap = new EncapsulatioExample2();
	      encap.setName("swapna");
	      encap.setAge(24);
	      encap.setIdNum("123");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	   }
	}


