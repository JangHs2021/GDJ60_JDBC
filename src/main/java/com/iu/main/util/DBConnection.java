package com.iu.main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws Exception {
		// 1. 접속 준비
		// 1. ID
		String username = "hr";
		// 2. PW
		String password = "hr";
		// 3. URL  						ServiceName / , SID :
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		// 4. Driver
		String driver = "oracle.jdbc.driver.OracleDriver";
				
		Class.forName(driver);
		
		// 2. DB 접속 실행
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
		// 3. Query문 생성
		// 4. Query문 DB로 미리 전송(미완성)
		// 5. ? 값 세팅(option)
		// 6. 최종 전송 및 결과 처리
		// 7. 연결 해제
	}
	
	public static void disConnect(ResultSet rs, PreparedStatement st, Connection connection) throws Exception {
		rs.close();
		st.close();
		connection.close();
	}
	
	public static void disConnect (PreparedStatement st, Connection connection) throws Exception {
		st.close();
		connection.close();
	}
}
