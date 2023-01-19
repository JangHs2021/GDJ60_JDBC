package com.iu.main.locations;

import java.util.Scanner;

public class LocationInput {
	private Scanner sc;
	private LocationDTO locationDTO;
	
	public LocationInput() {
		this.sc = new Scanner(System.in);
		this.locationDTO = new LocationDTO();
	}
	
	public LocationDTO setData() {
		System.out.println("Street_address 입력");
		locationDTO.setStreet_address(sc.next());
		
		System.out.println("Postal_code 입력");
		locationDTO.setPostal_code(sc.next());
		
		System.out.println("City 입력");
		locationDTO.setCity(sc.next());
		
		System.out.println("State_province 입력");
		locationDTO.setState_province(sc.next());
		
		System.out.println("Country_id입력");
		locationDTO.setCountry_id(sc.next());
		
		return locationDTO;
	}
	
	public LocationDTO deleteData() {
		System.out.println("삭제할 지역 번호 입력");
		locationDTO.setLocation_id(sc.nextInt());
		
		return locationDTO;
	}
	
	public LocationDTO updateData() {
		System.out.println("수정할 지역번호 입력");
		locationDTO.setLocation_id(sc.nextInt());
		
		System.out.println("수정할 주소 입력");
		locationDTO.setStreet_address(sc.next());
		
		System.out.println("수정할 코드 입력");
		locationDTO.setPostal_code(sc.next());
		
		return locationDTO;
	}
}
