package com.mdm.srvAngular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mdm.srvAngular.service.CarServiceImp;

@RestController
public class CarHandlerMapper {
	
	
//	========== Views =========
	@RequestMapping(value="/")
	public String init() {
		return "hello";
	}
	
	@RequestMapping(value="/addingcars")
	public ModelAndView addingcars( ModelMap model ) {
		model.addAttribute("nameattribute", "value");
		return new ModelAndView("redirect:/addCarsForm",model);	
	}
	
//	============ Controllers services =========
	
	@Autowired
	CarServiceImp carService;
	
	@RequestMapping(value="/products")
	public ResponseEntity<Object> showProduct(){
		return new ResponseEntity<>( carService.showCars() , HttpStatus.OK );
	}

}
