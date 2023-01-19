package com.iu.main.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
	private Scanner sc;
	private EmployeeDAO employeeDAO;
	private EmployeeView employeeView;
	private ArrayList<EmployeeDTO> ar;
	private EmployeeInput employeeInput;
	private EmployeeDTO employeeDTO;
	
	public EmployeeController() {
		sc = new Scanner(System.in);
		employeeDAO = new EmployeeDAO();
		employeeView = new EmployeeView();
		ar = new ArrayList<EmployeeDTO>();
		employeeInput = new EmployeeInput();
		employeeDTO = new EmployeeDTO();
	}
	
	public void start() throws Exception {
		boolean check = true;
	
		while(check) {
			System.out.println("1. 사원정보리스트");
			System.out.println("2. 개별사원정보");
			System.out.println("3. 사원 검색");
			System.out.println("4. 사원 추가");
			System.out.println("5. 사원 삭제");
			System.out.println("6. 사원 수정");
			System.out.println("7. 종    료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = employeeDAO.getList();
				employeeView.viewList(ar);
				break;
			case 2:
				employeeDTO = employeeInput.setID();
				employeeDTO = employeeDAO.getDetail(employeeDTO);
				employeeView.view(employeeDTO);
				break;
			case 3:
				employeeDTO = employeeInput.findName();
				ar = employeeDAO.getFind(employeeDTO);
				employeeView.view(ar);
				break;
			case 4:
				employeeDTO = employeeInput.insertData();
				select = employeeDAO.insertData(employeeDTO);
				
				if(select > 0) {
					employeeView.view("추가 성공");
				} else {
					employeeView.view("추가 실패");
				}
				break;
			case 5:
				employeeDTO = employeeInput.deleteData();
				select = employeeDAO.deleteData(employeeDTO);
				
				if(select > 0) {
					employeeView.view("삭제 성공");
				} else {
					employeeView.view("삭제 실패");
				}
				break;
			case 6:
				employeeDTO = employeeInput.updateData();
				select = employeeDAO.updateData(employeeDTO);
				
				if(select > 0) {
					employeeView.view("수정 성공");
				} else {
					employeeView.view("수정 실패");
				}
				break;
			default:
				check = false;
			}
		}
	}
}	
