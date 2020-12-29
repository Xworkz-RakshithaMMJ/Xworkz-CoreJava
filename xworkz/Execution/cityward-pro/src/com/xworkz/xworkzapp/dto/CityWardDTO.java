package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.contants.WardName;

public class CityWardDTO {

	private int wardNumber;
	private WardName wardName;
	private String corporatorName;
	private double population;
	private String areaSqkm;
	
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName vijaynagar) {
		this.wardName = vijaynagar;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String getAreaSqKm() {
		return areaSqkm;
	}
	public void setAreaInSqKm(String area) {
		this.areaSqkm = area;
	}
	
}
