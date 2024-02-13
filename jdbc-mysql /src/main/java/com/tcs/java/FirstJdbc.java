package com.tcs.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {
public static void main(String[] args) {
	
	Connection con;
	try {
		con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/mydb","root","Root123$");
		System.out.println("Connected...");
		Statement st= con.createStatement();
		
//	String sql= "insert into EMP values ("+"1013,'abc','Manager',7896,'1999-01-01',2300,null,10)";
//		int count =st.executeUpdate(sql);
//		System.out.println("Record inserted count :" +count);
		String update = "update EMP set sal =sal+0 where deptno in (10,20,30)";
		int count =st.executeUpdate(update);
		System.out.println("Records updated count#"+count);
		
		String 	sql ="Select * from EMP where empno=1012";
		ResultSet rs= st.executeQuery(sql);
		while(rs.next()) {
			
			System.out.println(rs.getInt(1) + " |" +rs.getString(2)+ " |" +rs.getString(3));
			
		}
//		ResultSetMetaData rmd=rs.getMetaData();
//		
//		System.out.println(rmd.getColumnCount());
//		System.out.println(rmd.getColumnName(1));
//		System.out.println(rmd.getColumnName(2));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//establish connection 
	
	
}
}
