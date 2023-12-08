package com.mdm.srvAngular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdm.srvAngular.service.testCarImp;

@RestController
public class webTestCtl {
	
	@Autowired
	testCarImp showCars;

	@GetMapping(value="/carstest")
	public ResponseEntity<Object> getList() {
		
		return new ResponseEntity<>(showCars.showCars(), HttpStatus.OK);
	}
}
