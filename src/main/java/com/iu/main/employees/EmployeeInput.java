package com.iu.main.employees;

import java.util.Scanner;

public class EmployeeInput {
	private Scanner sc;
	private EmployeeDTO employeeDTO;
	
	public EmployeeInput() {
		this.sc = new Scanner(System.in);
		this.employeeDTO = new EmployeeDTO();
	}
	
	public EmployeeDTO setID() {
		System.out.println("사원 번호 입력");
		employeeDTO.setEmployee_id(sc.nextInt());
		
		return employeeDTO;
	}
	
	public EmployeeDTO findName() {
		System.out.println("찾는 사원 이름");
		employeeDTO.setLast_name(sc.next());
		
		return employeeDTO;
	}
	
	public EmployeeDTO insertData() {
		System.out.println("추가할 성 입력");
		employeeDTO.setFirst_name(sc.next());
		System.out.println("추가할 이름 입력");
		employeeDTO.setLast_name(sc.next());
		System.out.println("추가할 이메일 입력");
		employeeDTO.setEmail(sc.next());
		System.out.println("추가할 전화번호 입력");
		employeeDTO.setPhone_number(sc.next());
		System.out.println("추가할 날짜 입력");
		employeeDTO.setHire_date(sc.next());
		System.out.println("추가할 직급 입력");
		employeeDTO.setJob_id(sc.next());
		System.out.println("추가할 월급 입력");
		employeeDTO.setSalary(sc.nextDouble());
		System.out.println("추가할 PCT 입력");
		employeeDTO.setCommission_pct(sc.nextDouble());
		System.out.println("추가할 MID 입력");
		employeeDTO.setManager_id(sc.nextInt());
		System.out.println("추가할 DID 입력");
		employeeDTO.setDepartment_id(sc.nextInt());
		
		return employeeDTO;
	}
	
	public EmployeeDTO deleteData() {
		System.out.println("삭제할 사원 번호 입력");
		employeeDTO.setEmployee_id(sc.nextInt());
		
		return employeeDTO;
	}
	
	public EmployeeDTO updateData() {
		System.out.println("수정할 MID 입력");
		employeeDTO.setManager_id(sc.nextInt());
		
		System.out.println("DID 입력");
		employeeDTO.setDepartment_id(sc.nextInt());
		
		return employeeDTO;
	}
}
