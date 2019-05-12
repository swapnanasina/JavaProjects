package com.scjp.chapter6.Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable{
	
}
public class SerializeCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cat c = new Cat();
     try {
    	 FileOutputStream fs = new FileOutputStream("testser.ser");
    	 ObjectOutputStream os = new ObjectOutputStream(fs);
    	 os.writeObject(c);
    	 os.close();
     }catch(Exception e) {
    	 e.printStackTrace();
     }
     try {
    	 FileInputStream fis = new FileInputStream("testser.ser");
    	 ObjectInputStream ois = new ObjectInputStream(fis);
    	 
    	 ois.close();
    	 
    	 
     }catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}
