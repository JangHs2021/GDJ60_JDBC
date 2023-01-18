package com.iu.main.locations;

import java.util.ArrayList;
import java.util.Scanner;

public class LocationController {
	private Scanner sc;
	private LocationDAO locationDAO;
	private LocationView locationView;
	
	public LocationController() {
		this.sc = new Scanner(System.in);
		this.locationDAO = new LocationDAO();
		this.locationView = new LocationView();
	}
	
	
	public void start() throws Exception {
		boolean check = true;
		ArrayList<LocationDTO> ar = null;
		
		while(check) {
			System.out.println("1. 지역리스트");
			System.out.println("2. 지역상세정보");
			System.out.println("3. 주소검색");
			System.out.println("4. 종    료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = locationDAO.getList();
				locationView.view(ar);
				break;
			case 2:
				System.out.println("지역 번호 입력");
				select = sc.nextInt();
				LocationDTO locationDTO = locationDAO.getDetail(select);
				if(locationDTO != null) {
					locationView.view(locationDTO);
				} else {
					locationView.view("Data 없음");
				}
				break;
			case 3:
				System.out.println("주소 입력");
				String add = sc.next();
				
				ar = locationDAO.getFind(add);
				break;
			default:
				check = false;
			}
		}
	}
}
