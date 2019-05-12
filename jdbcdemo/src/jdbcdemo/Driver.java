package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//1.get a connection to database
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
			
			//2.create a statement
			
			//3.execute SQL query
			
			//4.process the result set
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
