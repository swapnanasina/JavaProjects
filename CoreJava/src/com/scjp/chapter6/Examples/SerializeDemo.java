package com.scjp.chapter6.Examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee  e = new Employee();
e.name = "Swapna";
e.address = "bellevue Wa";
e.SSN = 1234567890;
e.number = 101;

try {
	FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(e);
    out.close();
    fileOut.close();
    System.out.printf("Serialized data is saved in /tmp/employee.ser");
 } catch (IOException i) {
    i.printStackTrace();
}
	}

}
