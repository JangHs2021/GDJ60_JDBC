package com.iu.main.employees;

import java.util.ArrayList;

public class EmployeeView {
	
	public void view(EmployeeDTO employeeDTO) {
		System.out.println("EID : " + employeeDTO.getEmployee_id());
		System.out.println("FNAME : " + employeeDTO.getFirst_name());
		System.out.println("LNAME : " + employeeDTO.getLast_name());
		System.out.println("EMAIL : " + employeeDTO.getEmail());
		System.out.println("PHONE : " + employeeDTO.getPhone_number());
		System.out.println("DATE : " + employeeDTO.getHire_date());
		System.out.println("JOB : " + employeeDTO.getJob_id());
		System.out.println("SALARY : " + employeeDTO.getSalary());
		System.out.println("PCT : " + employeeDTO.getCommission_pct());
		System.out.println("MID : " + employeeDTO.getManager_id());
		System.out.println("DID : " + employeeDTO.getDepartment_id());
	}
	
	public void viewList(ArrayList<EmployeeDTO> ar) {
		for(EmployeeDTO employeeDTO : ar) {
			System.out.println("DATE : " + employeeDTO.getHire_date());
			System.out.println("EID : " + employeeDTO.getEmployee_id());
			System.out.println("FNAME : " + employeeDTO.getFirst_name());
			System.out.println("LNAME : " + employeeDTO.getLast_name());
			System.out.println("JOB : " + employeeDTO.getJob_id());
			System.out.println("DID : " + employeeDTO.getDepartment_id());
		}
	}
	
	public void view(ArrayList<EmployeeDTO> ar) {
		for(EmployeeDTO employeeDTO : ar) {
			this.view(employeeDTO);
		}
	}
	
	public void view(String msg) {
		System.out.println(msg);
	}
}
