package com.iu.main.departments;

import java.util.ArrayList;

public class DepartmentView {
	
	public void view(DepartmentDTO departmentDTO) {
		System.out.println("ID : " + departmentDTO.getDepartment_id());
		System.out.println("Name : " + departmentDTO.getDepartment_name());
		System.out.println("MID : " + departmentDTO.getManager_id());
		System.out.println("LID : " + departmentDTO.getLocation_id());
	}
	
	public void view(ArrayList<DepartmentDTO> ar) {
		
		for(DepartmentDTO departmentDTO : ar) {
			this.view(departmentDTO);
		}
	}
	
	public void view(String msg) {
		System.out.println(msg);
	}
}
