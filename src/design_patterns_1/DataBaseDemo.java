
/*Create a JDBC application to establish a connection with the DB in a singleton manner.
(Hint - Declare a separate utility class called DatabaseConnection which has a static 
method called getConnection which returns a new Connection instance if there is no active
connection with the DB, else it returns the existing Connection instance)*/



package design_patterns_1;

import java.sql.Connection;
import java.sql.DriverManager;


class DBConnection{
	private static Connection con = null;
	public static Connection getConnection() {
		if(con==null) { //if no active connection to the DB
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","Daphinetayebwa125");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return con;
	}
	
}

//main method to test
public class DataBaseDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//returns the Class object associated with the class
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("connected sucessfully");
	}

}
