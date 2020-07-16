package co.edureka.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionFactory {
	
	private static String dbURL="jdbc:postgresql://"  + "ec2-54-246-115-40.eu-west-1.compute.amazonaws.com" + "/d6oqjkethnahou?sslmode=require";;
	private static String dbUser="jtbpoiomkkcmlk";;
	private static String dbPassword="f341fae1a367c94ffa4e3a4765ce078f5372d97e8dba965ffe7cffd17a47733c";
	
	public static Connection createConnection()
	{
		 Connection con=null;
		try{
			try {
				System.out.println("hi");
				Class.forName("org.postgresql.Driver");
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


