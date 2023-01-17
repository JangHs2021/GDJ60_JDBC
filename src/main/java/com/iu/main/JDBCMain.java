package com.iu.main;

import com.iu.main.util.DBConnection;

public class JDBCMain {

	public static void main(String[] args) {
		DBConnection con = new DBConnection();
		
		System.out.println("start");
		
		// 참조변수명.맴버들
		try {
			con.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("finish");
	}
}
