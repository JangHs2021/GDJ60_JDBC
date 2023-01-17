package com.iu.main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public void getConnection() throws Exception {
		// 1. ID
		String username = "hr";
		// 2. PW
		String password = "hr";
		// 3. URL
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		// 4. Driver
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("EMPLOYEE_ID"));
			System.out.println(rs.getString("FIRST_NAME"));
			System.out.println(rs.getString("LAST_NAME"));
			System.out.println(rs.getString("EMAIL"));
			System.out.println(rs.getString("PHONE_NUMBER"));
			System.out.println(rs.getDate("HIRE_DATE"));
			System.out.println(rs.getString("JOB_ID"));
			System.out.println(rs.getInt("SALARY"));
		}
	}
}
