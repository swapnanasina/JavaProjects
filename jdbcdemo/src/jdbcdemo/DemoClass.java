package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql
//load and register the driver
//create connection
//create a statement
//execute the query
//process the results
//close the connection

public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		String url = "jdbc:mysql://localhost:3306/university";
		String uname = "root";
		String pass = "sqlpassword";
		String query = "select Name from students where studentId = 1235";
		// forname() will help you to load the class
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		// getconnection is method in java which will give instance of connection
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		rs.next();
		String name = rs.getString("Name");
		System.out.println(name);
		st.close();
		con.close();

	}

}
