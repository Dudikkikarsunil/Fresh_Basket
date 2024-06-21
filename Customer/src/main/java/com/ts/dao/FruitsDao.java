package com.ts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Fruits;
import com.ts.model.Fruits;
@Service
public class FruitsDao {
	@Autowired
	FruitsRepo fruitsRepo;

	public List<Fruits> getAllFruits(){
		return fruitsRepo.findAll();
	}
	public Fruits getByName(String name){
		return fruitsRepo.findByFrtName(name);
	}
	public void DeleteById(int id){
		  fruitsRepo.deleteById(id);;
	}
	public Fruits updateProd(Fruits fruits){
		return fruitsRepo.save(fruits);
	}
	public void register (Fruits prod){
		fruitsRepo.save(prod);
	}
}
