package com.xworkz.xworkzapp.hotel;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.dto.HotelDTO;

public class Hotel {

	public HotelDTO[] hotel = new HotelDTO[2];
	public int index;
	
	public void addHotelDetails(HotelDTO hot){
		if(hot.getHotelName()!=null && hot.getHotelLocation()!=null && hot.getFoodItems()!=0){
			if(hot.getFoodItems()>=10){
				System.out.println("Hotel details are correct");
				hotel[index++]=hot;
				System.out.println("Hotel details are added");
				
			}
			else{
				System.out.println("The food items should be greater than 10");
			}
	}
		else{
			System.out.println("The food item,location,name cant be empty");
		}
}
	public void showAllHotelDetails(){
		for(int i=0;i<hotel.length;i++){
			if(hotel[i]!=null){
				System.out.println(hotel[i].getHotelName()+" "+hotel[i].getHotelLocation()+" "+hotel[i].getOwnerName()+" "+hotel[i].getType()
						+" "+hotel[i].getService()+" "+hotel[i].getFoodItems());
			}
			else{
				System.out.println("No details are added");	
				}
		}
	}
	public void searchHotelbyLocationAndName(Location hotelLocation,String hotelName){
		for(int i=0;i<hotel.length;i++){
			if(hotel[i]!=null){
				if(hotel[i].getHotelLocation().equals(hotelLocation)&& hotel[i].getHotelName().equals(hotelName)){
					System.out.println(hotel[i].getHotelName());
			}
		}
		
	}
		
	}
	public HotelDTO returnOwnerNameByName(String hotelName ){
		HotelDTO dto = null;
		for(int i=0;i<hotel.length;i++){
			if(hotel[i]!=null){
				if(hotel[i].getHotelName().equals(hotelName)){
					System.out.println(hotel[i].getOwnerName());
				}
			}
			
		}
		return dto;
	}
	
}
