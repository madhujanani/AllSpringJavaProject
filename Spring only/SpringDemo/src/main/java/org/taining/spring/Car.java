package org.taining.spring;


public class Car {
	
	private String make;
	private String model;
	private int Year;
	
	public String getMake() {
		return make;
	}
 
	public void setMake(String make) {
		this.make = make;
	}
 
	public String getModel() {
		return model;
	}
 
	public void setModel(String model) {
		this.model = model;
	}
 
	public int getYear() {
		return Year;
	}
 
	public void setYear(int year) {
		Year = year;
	}
 
	public  String getCarDetails() {
		return this.make+":"+this.model+ this.Year;
	}
	
	
 
}
	

