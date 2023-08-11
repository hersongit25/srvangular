package com.mdm.srvAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {
	
	@RequestMapping(value="/add-cars")
	public String form() {
		return "addCarsForm";
	}

}
