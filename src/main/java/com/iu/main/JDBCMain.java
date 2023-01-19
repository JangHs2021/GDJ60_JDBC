package com.iu.main;

import com.iu.main.departments.DepartmentController;
import com.iu.main.departments.DepartmentDAO;
import com.iu.main.departments.DepartmentDTO;
import com.iu.main.employees.EmployeeController;
import com.iu.main.locations.LocationController;
import com.iu.main.locations.LocationDAO;
import com.iu.main.locations.LocationDTO;
import com.iu.main.util.DBConnection;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("start");
		DepartmentController dc = new DepartmentController();
		LocationController lc = new LocationController();
		EmployeeController ec = new EmployeeController();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		LocationDAO locationDAO = new LocationDAO();
		
		try {
			//dc.start();
			//lc.start();
			ec.start();
//			DepartmentDTO departmentDTO = new DepartmentDTO();
//			departmentDTO.setDepartment_name("TestIT");
//			departmentDTO.setManager_id(200);
//			departmentDTO.setLocation_id(1700);
//			departmentDTO.setDepartment_id(280);
			
//			int result = departmentDAO.deleteData(departmentDTO);
//			int result = departmentDAO.setData(departmentDTO);
			
//			LocationDTO locationDTO = new LocationDTO();
//			locationDTO.setStreet_address("Namgu 64");
//			locationDTO.setPostal_code("44748");
//			locationDTO.setCity("korea");
//			locationDTO.setState_province("Ulsan");
//			locationDTO.setCountry_id("UK");
			
//			locationDTO.setLocation_id(3400);
//			int result = locationDAO.deleteData(locationDTO);
//			int result = locationDAO.setData(locationDTO);
//			if(result > 0) {
//				System.out.println("성공");
//			} else {
//				System.out.println("실패");
//			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
	}
}
