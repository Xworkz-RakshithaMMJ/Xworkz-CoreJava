package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.Companies;
import com.xworkz.xworkzapp.dto.FlightBookingDTO;
import com.xworkz.xworkzapp.flight.Flight;

public class FlightUtil {
public static void main(String[] args) {
	Flight flight = new Flight();
	
	FlightBookingDTO fb = new FlightBookingDTO();

	fb.setAirplaneCode("AIR123");
	fb.setStartingPoint("Delhi");
	fb.setDestinationPoint("Mumbai");
	fb.setDomestic(true);
	fb.setBusinessClassPrice(3000.00);
	fb.setCompany(Companies.AIRINDIA);
	fb.setEconomyClassPrice(1000.00);
	
	
	
	FlightBookingDTO fb1 = new FlightBookingDTO();

	fb1.setAirplaneCode("AIR124");
	fb1.setStartingPoint("Bengaluru");
	fb1.setDestinationPoint("Mysuru");
	fb1.setDomestic(true);
	fb1.setBusinessClassPrice(30000.00);
	fb1.setCompany(Companies.AIRINDIA);
	fb1.setEconomyClassPrice(1005.00);
	
	
	
	flight.addFlightBookingInfo(fb);
	flight.addFlightBookingInfo(fb1);
	flight.displayAllFlightDetails();
	flight.searchFlightByStartingPoint("Delhi"); 
}
	
}
