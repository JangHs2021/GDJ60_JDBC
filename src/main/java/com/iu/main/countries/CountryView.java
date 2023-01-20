package com.iu.main.countries;

import java.util.ArrayList;

public class CountryView {
	
	public void view(CountryDTO countryDTO) {
		System.out.println("CID : " + countryDTO.getCountry_id());
		System.out.println("NAME : " + countryDTO.getCountry_name());
		System.out.println("RID : " + countryDTO.getRegion_id());
	}
	
	public void view(ArrayList<CountryDTO> ar) {
		for(CountryDTO countryDTO : ar) {
			this.view(countryDTO);
		}
	}
	
	public void view(String msg) {
		System.out.println(msg);
	}
}
