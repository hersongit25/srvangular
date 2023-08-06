package com.mdm.srvAngular.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarHandlerMapping {
	
	
//	========== Views =========
	@RequestMapping(value="/")
	public String init() {
		return "hello";
	}

}
