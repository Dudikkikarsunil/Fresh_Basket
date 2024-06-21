package com.ts.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.FruitsDao;
import com.ts.model.Fruits;
@CrossOrigin(origins="*")
@RestController
public class FruitsController {
	@Autowired
	FruitsDao fruitsDao;
	@RequestMapping("/allFruits")
	public List<Fruits> getAllFruits(){
		
		return fruitsDao.getAllFruits() ;
		
	}
	@PostMapping("/fruitsRegister")
	public void register(@RequestBody Fruits prod){
		System.out.println("Data Received : "+prod);
		fruitsDao.register(prod);
	}
}
