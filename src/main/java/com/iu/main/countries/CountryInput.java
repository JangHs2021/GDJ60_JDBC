package com.iu.main.countries;

import java.util.Scanner;

public class CountryInput {
	private Scanner sc;
	
	public CountryInput() {
		sc = new Scanner(System.in);
	}
	
	public CountryDTO inputDetail(CountryDTO countryDTO) {
		System.out.println("CID 검색 : ");
		countryDTO.setCountry_id(sc.next());
		
		return countryDTO;
	}
	
	public CountryDTO countryFind(CountryDTO countryDTO) {
		System.out.println("검색할 나라명 입력");
		countryDTO.setCountry_name(sc.next());
		
		return countryDTO;
	}
}
