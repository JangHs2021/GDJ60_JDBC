package com.iu.main.departments;

import java.util.Scanner;

public class DepartmentInput {
	private Scanner sc;
	private DepartmentDTO departmentDTO;
	
	public DepartmentInput() {
		sc = new Scanner(System.in);
		departmentDTO = new DepartmentDTO();
	}
	
	// 추가
	public DepartmentDTO setData() {
		departmentDTO = new DepartmentDTO();
		
		System.out.println("부서명 입력");
		departmentDTO.setDepartment_name(sc.next());
		System.out.println("매니저 번호 입력");
		departmentDTO.setManager_id(sc.nextInt());
		System.out.println("지역 번호 입력");
		departmentDTO.setLocation_id(sc.nextInt());
		
		return departmentDTO;
	}
	
	// 삭제
	public DepartmentDTO deleteData() {
		departmentDTO = new DepartmentDTO();
		
		System.out.println("삭제할 부서 번호 입력");
		departmentDTO.setDepartment_id(sc.nextInt());
		
		return departmentDTO;
	}
	
	// 수정
	public DepartmentDTO updateData() {
		departmentDTO = new DepartmentDTO();
		
		System.out.println("수정할 부서 번호 입력");
		departmentDTO.setDepartment_id(sc.nextInt());
		
		System.out.println("수정할 부서명 입력");
		departmentDTO.setDepartment_name(sc.next());
		
		System.out.println("수정할 매니저 번호 입력");
		departmentDTO.setManager_id(sc.nextInt());
		
		System.out.println("수정할 지역 번호 입력");
		departmentDTO.setLocation_id(sc.nextInt());
		
		return departmentDTO;
	}
}
