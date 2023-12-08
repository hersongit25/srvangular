package com.mdm.srvAngular.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mdm.srvAngular.model.CarEntity;

@Service(value="mycar")
public class testCarImp implements CarService {

	@Override
	public Collection<CarEntity> showCars() {
		List<CarEntity> list = new ArrayList<>();
		list.add( new CarEntity(2000,"CHEVY","Chevrolet") );
		list.add( new CarEntity(1980,"JETTA","WOSKWAGEN") );
		
//		Collections.sort( (List<CarEntity>) list );
		
		return list;
	}

}
