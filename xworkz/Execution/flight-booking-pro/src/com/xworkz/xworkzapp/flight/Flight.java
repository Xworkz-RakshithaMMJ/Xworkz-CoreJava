package com.xworkz.xworkzapp.flight;

import com.xworkz.xworkzapp.dto.FlightBookingDTO;

public class Flight {

    FlightBookingDTO[] flightdtos = new FlightBookingDTO[3];
	public int index;
	
	public void addFlightBookingInfo(FlightBookingDTO flight){
		System.out.println("Adding flight booking details");
		if(flight!=null){
			if(flight.getAirplaneCode()!=null){
				if(flight.getCompany()!=null){
					if(flight.getBusinessClassPrice() >=1000){
						if(flight.getStartingPoint()!=null){
							flightdtos[index++]=flight;
						System.out.println("Added details");	
							
						}
						
						else{
							System.out.println("Booking is not available");
						}
					}
					else{
						System.out.println("Business class price less than 1000");
					}
				}
			}
		
		}
}
	public void displayAllFlightDetails(){
		System.out.println("Displaying flight details");
		for(int i=0;i<flightdtos.length;i++){
			if(flightdtos[i]!=null){
				System.out.println(flightdtos[i].getAirplaneCode()+" "+flightdtos[i].getStartingPoint()+" "+flightdtos[i].getDestinationPoint()+" "+flightdtos[i].getTotalSeats()+" "+flightdtos[i].getBusinessClassPrice()+" "+flightdtos[i].getEconomyClassPrice());
			}
		}
	} 
	
	public FlightBookingDTO searchFlightByStartingPoint(String startingPoint){
		FlightBookingDTO dto = null;
		for(int i=0;i<flightdtos.length;i++){
			if(flightdtos[i]!=null){
				if(flightdtos[i].getStartingPoint().equals(startingPoint)){
					System.out.println(flightdtos[i].getAirplaneCode()+ " "+flightdtos[i].getCompany()+" "+flightdtos[i].getBusinessClassPrice()+" "+flightdtos[i].getDestinationPoint()+" "+flightdtos[i].getDomestic()+" "+flightdtos[i].getStartingPoint());
				}
			}
		}
		return dto;
		
			
	}
		
			
	}
	
