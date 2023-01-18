package com.iu.main.locations;

import java.util.ArrayList;

public class LocationView {
	
	public void view(LocationDTO locationDTO) {
		System.out.println("LID : " + locationDTO.getLocation_id());
		System.out.println("CODE : " + locationDTO.getPostal_code());
		System.out.println("CITY : " + locationDTO.getCity());
		System.out.println("STATE : " + locationDTO.getState_province());
		System.out.println("COUNTRYID : " + locationDTO.getCountry_id());
	}
	
	public void view(ArrayList<LocationDTO> ar) {
		for(LocationDTO locationDTO : ar) {
			this.view(locationDTO);
		}
	}
	
	public void view(String msg) {
		System.out.println(msg);
	}
}
