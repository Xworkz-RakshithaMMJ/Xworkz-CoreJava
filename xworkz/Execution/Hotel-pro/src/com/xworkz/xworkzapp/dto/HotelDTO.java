package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.Location;

public class HotelDTO {

	private String hotelName;
	private Location hotelLocation;
	private String ownerName;
	private String type;
	private String service;
	private int foodItems;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Location getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(Location hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(int foodItems) {
		this.foodItems = foodItems;
	}
	
	
	
}
