package com.iu.main.countries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryController {
	private Scanner sc;
	private CountryDAO countryDAO;
	private CountryView countryView;
	private ArrayList<CountryDTO> ar;
	private CountryDTO countryDTO;
	private CountryInput countryInput;
	
	public CountryController() {
		this.sc = new Scanner(System.in);
		this.countryDAO = new CountryDAO();
		this.countryView = new CountryView();
		this.ar = new ArrayList<CountryDTO>();
		this.countryDTO = new CountryDTO();
		this.countryInput = new CountryInput();
	}
	
	
	public void start() throws Exception {
		boolean check = true;
		
		while(check) {
			System.out.println("1. 나라리스트");
			System.out.println("2. 개별나라정보");
			System.out.println("3. 나라 검색");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = countryDAO.getList();
				countryView.view(ar);
				break;
			case 2:
				countryDTO = countryInput.inputDetail(countryDTO);
				countryDTO = countryDAO.getDetail(countryDTO);
				countryView.view(countryDTO);
				break;
			case 3:
				
				break;
			default:
				check = false;
			}
		}
	}
}
