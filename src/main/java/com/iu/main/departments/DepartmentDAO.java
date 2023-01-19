package com.iu.main.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnection;

public class DepartmentDAO {
	
	public DepartmentDTO getDetail(int department_id) throws Exception {
		DepartmentDTO departmentDTO = null;
		// DB 연결 하기 위해 필요한 코드를 DBConnection에서 호출
		Connection connection = DBConnection.getConnection();
		
		// SQL에서 변하는 값을 주고 싶은 때 ? 사용
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		// ? 에 들어갈 값 첫번째, main에서 호출한 메서드의 인자값을 통해 값 입력
		// SQL는 인덱스 1번 부터 시작
		st.setInt(1, department_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getNString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
		} 
		
		DBConnection.disConnect(rs, st, connection);
		return departmentDTO;
	}
	
	public ArrayList<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
		// 1. 접속 정보 준비
		// 2. DB 접속
		// DBConnection dbConnection = new DBConnection();
		// Connection connection = dbConnection.getConnection();
		
		Connection connection = DBConnection.getConnection();
		
		// 3. Query문 생성
		String sql = "SELECT * FROM DEPARTMENTS";
		
		// 4. 미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		
		// 5. ? 세팅
		
		// 6. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getNString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDTO);
		}
		
		// 7. 연결 해제
		// rs.close();
		// st.close();
		// connection.close();
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
	public int setData(DepartmentDTO departmentDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) "
				+ " VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, departmentDTO.getDepartment_name());
		st.setInt(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;		
	}
	
	public int deleteData(DepartmentDTO departmentDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setInt(1, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
	}
	
	public int updateData(DepartmentDTO departmentDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME = ?, MANAGER_ID = ?, LOCATION_ID = ? "
				+ " WHERE DEPARTMENT_ID = ?";
				
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, departmentDTO.getDepartment_name());
		st.setInt(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());
		st.setInt(4, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
	}
}
