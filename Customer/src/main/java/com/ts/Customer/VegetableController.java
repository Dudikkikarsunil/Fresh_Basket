package com.ts.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.VegetableDao;

import com.ts.model.Vegetables;
@CrossOrigin(origins="*")
@RestController
public class VegetableController {
	@Autowired
	VegetableDao vegetableDao;
	@RequestMapping("/allVegetables")
	public List<Vegetables> getAllVegetables(){
		
		return vegetableDao.getAllVegetables() ;
		
	}
	@PostMapping("/vegRegister")
	public void register(@RequestBody Vegetables prod){
		System.out.println("Data Received : "+prod);
		vegetableDao.register(prod);
	}
	
}
