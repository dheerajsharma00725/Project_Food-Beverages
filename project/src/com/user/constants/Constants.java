package com.user.constants;

public class Constants {
	
	public static String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	public static String dbURL = "jdbc:mysql://localhost:3306/demo";
	public static String username = "root";
	public static String password = "root";
	
	//Queries
	public static String query = "insert into user_mstr(fname,lname,uid,dob,mobile,email,upwd,created_timestamp,updated_timestamp)"
			+ "values(?,?,?,?,?,?,?,?,?)";
}
