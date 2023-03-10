package com.iu.main.locations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnection;

public class LocationDAO {
	
	public ArrayList<LocationDTO> getFind(String search) throws Exception {
		Connection connection = DBConnection.getConnection();
		LocationDTO locationDTO = null;
		ArrayList<LocationDTO> ar = new ArrayList<LocationDTO>();
		
		String sql = "SELECT * FROM LOCATIONS WHERE STREET_ADDRESS LIKE ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, "%"+search+"%");
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			ar.add(locationDTO);
		}
		return ar;
	}
	
	public LocationDTO getDetail(int location_id) throws Exception {
		LocationDTO locationDTO = null;
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setInt(1, location_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
		} 
		
		DBConnection.disConnect(rs, st, connection);
		
		return locationDTO;
	}
	
	public ArrayList<LocationDTO> getList() throws Exception {
		ArrayList<LocationDTO> ar = new ArrayList<LocationDTO>();
		// 1. ?????? ?????? ??????
		// 2. DB ??????
		// DBConnection dbConnection = new DBConnection();
		// Connection connection = dbConnection.getConnection();
		
		Connection connection = DBConnection.getConnection();
		
		// 3. Query??? ??????
		String sql = "SELECT * FROM LOCATIONS";
		
		// 4. ?????? ??????
		PreparedStatement st = connection.prepareStatement(sql);
		
		// 5. ? ??????
				
		// 6. ?????? ?????? ??? ?????? ??????
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			ar.add(locationDTO);
		}
		
		// 7. ?????? ??????
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
}
