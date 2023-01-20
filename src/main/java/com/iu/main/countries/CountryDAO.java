package com.iu.main.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnection;

public class CountryDAO {
	private ArrayList<CountryDTO> ar;
	
	public CountryDAO() {
		this.ar = new ArrayList<CountryDTO>();
	}
	
	public ArrayList<CountryDTO> getList() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
			ar.add(countryDTO);
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
	public CountryDTO getDetail(CountryDTO countryDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, countryDTO.getCountry_id());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return countryDTO;
	}
	
	public CountryDTO getFind(CountryDTO countryDTO) throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_NAME LIKE '%?%'";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, countryDTO.getCountry_name());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			countryDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countryDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countryDTO.setRegion_id(rs.getInt("REGION_ID"));
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return countryDTO;
	}
}
