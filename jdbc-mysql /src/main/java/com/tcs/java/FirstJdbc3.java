package com.tcs.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc3 {
public static void main(String[] args) {
	
	Connection con;
	try {
		con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/mydb","root","Root123$");
		System.out.println("Connected...");
		
		PreparedStatement ps= con.prepareStatement("update EMP set sal =sal+ ? where empno =?");
		
		ps.setInt(1, 0);
		ps.setInt(2, 7839);
		
		int count = ps.executeUpdate();
		
		System.out.println(count+ "record updated......");
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//establish connection 
	
	
}
}
