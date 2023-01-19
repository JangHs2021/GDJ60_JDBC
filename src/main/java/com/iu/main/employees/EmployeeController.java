package com.iu.main.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
	private Scanner sc;
	private EmployeeDAO employeeDAO;
	private EmployeeView employeeView;
	
	public EmployeeController() {
		sc = new Scanner(System.in);
		employeeDAO = new EmployeeDAO();
		employeeView = new EmployeeView();
	}
	
	public void start() throws Exception {
		boolean check = true;
		ArrayList<EmployeeDTO> ar = null;
		
		while(check) {
			System.out.println("1. 사원정보리스트");
			System.out.println("2. 개별사원정보");
			System.out.println("3. 사원 검색");
			System.out.println("4. 종    료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				employeeDAO.getList();
				break;
			case 2:
				System.out.println("사원 번호 입력");
				select = sc.nextInt();
				employeeDAO.getDetail(select);
				break;
			case 3:
				
				break;
			default:
				check = false;
			}
		}
	}
}	
