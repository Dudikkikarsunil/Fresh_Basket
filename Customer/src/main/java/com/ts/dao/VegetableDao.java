package com.ts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Vegetables;
@Service
public class VegetableDao {
	@Autowired
	VegetableRepo vegetableRepo;

	public List<Vegetables> getAllVegetables(){
		return vegetableRepo.findAll();
	}
	public Vegetables getByName(String name){
		return vegetableRepo.findByVegName(name);
	}
	public void DeleteById(int id){
		  vegetableRepo.deleteById(id);;
	}
	public Vegetables updateProd(Vegetables vegetables){
		return vegetableRepo.save(vegetables);
	}
	public void register (Vegetables prod){
		vegetableRepo.save(prod);
	}
}
