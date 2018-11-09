package com.agilecrm.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class contactutils {

 public static Connection con=null;
public static Connection jdbcConnection() throws Exception
{ 
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/training","root","root123");  
		 System.out.print(con);
		 return con;
}
}
