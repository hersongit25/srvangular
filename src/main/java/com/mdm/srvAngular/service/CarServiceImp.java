package com.mdm.srvAngular.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mdm.srvAngular.model.CarEntity;

@Service
public class CarServiceImp implements CarService {

	private static Map<Integer,CarEntity> carObj = new HashMap<>();
	private static int number = 0;
	
	static {
		CarEntity myCar = new CarEntity();
		myCar.setYear(2012);
		myCar.setModel("Mustang");
		myCar.setVendor("FORD");
		
		carObj.put((number = number++), myCar);
	}
	
	@Override
	public Collection<CarEntity>  showCars(){
		return carObj.values();
	}
}
