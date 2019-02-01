package com.java.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String userName = "hbstudent";
		String password = "hbstudent";
		try {
			System.out.println("Connecting to Database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, userName , password);
			System.out.println("Connection Successful!!");
		} catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
