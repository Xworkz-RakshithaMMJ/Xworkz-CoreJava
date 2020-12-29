package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.dto.HotelDTO;
import com.xworkz.xworkzapp.hotel.Hotel;

public class HotelUtil {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		HotelDTO hoteldto = new HotelDTO();
		hoteldto.setHotelName("Ashoka Hotel");
		hoteldto.setHotelLocation(Location.VIJAYNAGAR);
		hoteldto.setOwnerName("Geetha");
		hoteldto.setService("9am to 9pm");
		hoteldto.setType("North Indian");
		hoteldto.setFoodItems(20);
		
		
		Hotel hotel1 = new Hotel();
		
		HotelDTO hoteldto1 = new HotelDTO();
		hoteldto1.setHotelName("Mayura Hotel");
		hoteldto1.setHotelLocation(Location.VVPURAM);
		hoteldto1.setOwnerName("Rajeshwari");
		hoteldto1.setService("9am to 10pm");
		hoteldto1.setType("South Indian");
		hoteldto1.setFoodItems(10);
		
		hotel.addHotelDetails(hoteldto);
		hotel.addHotelDetails(hoteldto1);
		
		hotel.searchHotelbyLocationAndName(Location.VVPURAM, "Mayura Hotel");
		
		hotel.returnOwnerNameByName("Ashoka Hotel");
		
		hotel.showAllHotelDetails();
	}
}
