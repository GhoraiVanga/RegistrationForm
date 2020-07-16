package co.edureka.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionFactory {
	
	private static String dbURL="jdbc:mysql://127.0.0.1:3306/details";
	private static String dbUser="root";;
	private static String dbPassword="suman";
	
	public static Connection createConnection()
	{
		 Connection con=null;
		try{
			try {
				System.out.println("hi");
				Class.forName("com.mysql.jdbc.Driver");
				}
				catch(Exception  e) {
				   System.out.println(e);
				   System.exit(1);
				}	
			  System.out.println("execute");
		     con = DriverManager.getConnection(dbURL,dbUser,dbPassword);
		     System.out.println("execute");
		   }
		  catch(Exception e)
		{ 
			  System.out.println(e);
			  e.printStackTrace();
		
		
		}
		return con;
	}

}


