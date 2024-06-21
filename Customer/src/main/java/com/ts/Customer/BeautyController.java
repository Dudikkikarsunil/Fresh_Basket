package com.ts.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.BeautyDao;
import com.ts.model.Beauty;
@CrossOrigin(origins="*")
@RestController
public class BeautyController {
	@Autowired
	BeautyDao beautyDao;
	@RequestMapping("/allBeauty")
	public List<Beauty> getAllBeauty(){
		
		return beautyDao.getAllBeautys() ;
		
	}
	@PostMapping("/BeautyRegister")
	public void register(@RequestBody Beauty prod){
		System.out.println("Data Received : "+prod);
		beautyDao.register(prod);
	}
}
