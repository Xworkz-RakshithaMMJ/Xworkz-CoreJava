package com.xworkz.xworkzapp.operation;
import com.xworkz.xworkzapp.dto.CityWardDTO;

public class Operation {

    CityWardDTO[] cityward = new CityWardDTO[2];
	public int index;
	
	public void addCityWardDetails(CityWardDTO ward){
		System.out.println("Adding city ward details");
		if(cityward!=null){
			if(ward.getWardNumber()!= 0){
				if(ward.getWardName()!=null){
					if(ward.getPopulation() >=5000){
						System.out.println("City ward details are correct");
						cityward[index++] = ward;
						System.out.println("city ward details are added");
						}
						
						else{
							System.out.println("the population should be greater than 5000");
						}
					}
					else{
						System.out.println(" the ward no,ward name,cant be empty");
					}
				}
			}
		
		}

	public void displayAllCityWardDetails(){
		for(int i=0;i<cityward.length;i++){
			if(cityward[i]!=null){
				System.out.println("Display all method started");
				System.out.println(cityward[i].getWardNumber()+" "+cityward[i].getWardName()+" "+cityward[i].getCorporatorName()+" "+cityward[i].getAreaSqKm()+" "+cityward[i].getPopulation());
				System.out.println("Display all method ended");
			}
		}
	}
	

public void searchCityByWardNumber(int wardNo){
	for(int i=0;i<cityward.length;i++){
		if(cityward[i]!=null){
			if(cityward[i].getWardName().equals(wardNo)){
				System.out.println(cityward[i].getWardName()+ " "+cityward[i].getWardNumber()+" "+cityward[i].getPopulation()+" "+cityward[i].getAreaSqKm()
						+" "+cityward[i].getCorporatorName());
			}
		}
	}
	
	
		
}
public CityWardDTO returnCorporatorByWardNumber(int wardNo){
	CityWardDTO dto = null;
	for(int i=0;i<cityward.length;i++){
		if(cityward[i]!=null){
			dto = cityward[i];
			if(cityward[i].getWardNumber()==wardNo){
				System.out.println(cityward[i].getCorporatorName());
			}
		}
	}
	return dto;
}
		
}











