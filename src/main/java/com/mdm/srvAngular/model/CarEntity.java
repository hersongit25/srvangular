package com.mdm.srvAngular.model;

import org.springframework.stereotype.Component;

@Component("carBean")
public class CarEntity {
	
	protected int year;
	protected String model;
	protected String vendor;
	
	public CarEntity() {}
	
	public CarEntity( int year, String mod, String vendor ) {
		this.year = year;
		this.model = mod;
		this.vendor = vendor;
	}
	
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
