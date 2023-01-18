package com.iu.main.employees;

import java.util.ArrayList;

public class EmployeeView {
	
	public void view(EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO.getEmployee_id());
		System.out.println(employeeDTO.getFirst_name());
		System.out.println(employeeDTO.getLast_name());
		System.out.println(employeeDTO.getEmail());
		System.out.println(employeeDTO.getPhone_number());
		System.out.println(employeeDTO.getHire_date());
		System.out.println(employeeDTO.getJob_id());
		System.out.println(employeeDTO.getSalary());
		System.out.println(employeeDTO.getCommission_pct());
		System.out.println(employeeDTO.getManager_id());
		System.out.println(employeeDTO.getDepartment_id());
	}
	
	public void view(ArrayList<EmployeeDTO> ar) {
		for(EmployeeDTO employeeDTO : ar) {
			this.view(employeeDTO);
		}
	}
	
	public void view(String msg) {
		System.out.println("Data 없음");
	}
}
