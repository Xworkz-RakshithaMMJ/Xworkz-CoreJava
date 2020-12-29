package com.xworkz.xworkzapp.util;
import com.xworkz.xworkzapp.operation.Operation;
import com.xworkz.xworkzapp.contants.WardName;
import com.xworkz.xworkzapp.dto.CityWardDTO;


public class CitywardUtil{
	public static void main(String[] args) {
		Operation city = new Operation();
		
		CityWardDTO cw = new CityWardDTO();
		cw.setWardName(WardName.VIJAYNAGAR);
		cw.setWardNumber(1);
		cw.setPopulation(5000);
		cw.setCorporatorName("Guru");
		cw.setAreaInSqKm("35 SqKm");
		
		CityWardDTO cw1 = new CityWardDTO();
		cw1.setWardName(WardName.JAYANAGAR);
		cw1.setWardNumber(2);
		cw1.setPopulation(6000);
		cw1.setCorporatorName("Giri");
		cw1.setAreaInSqKm("45 SqKm");
		
		city.addCityWardDetails(cw);
		city.addCityWardDetails(cw1);
		
		city.displayAllCityWardDetails();
		city.searchCityByWardNumber(2);
		city.returnCorporatorByWardNumber(1);
		
		
	}
}