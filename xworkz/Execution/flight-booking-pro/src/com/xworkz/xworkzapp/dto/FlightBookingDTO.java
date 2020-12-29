
package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.Companies;

public class FlightBookingDTO {

	private String airplaneCode;
	private Companies company;
	private String startingPoint;
	private String destinationPoint;
	private String totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;
	
	
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	public Companies getCompany() {
		return company;
	}
	public void setCompany(Companies airindia) {
		this.company = airindia;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
	public boolean getDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	
	
	
}
