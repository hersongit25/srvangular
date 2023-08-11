package com.mdm.srvAngular.model;

//@Component("carBean")
public class CarEntity {
	
	protected int year;
	protected String model;
	protected String vendor;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
