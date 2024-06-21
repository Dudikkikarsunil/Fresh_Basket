package com.ts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Beauty;
@Service
public class BeautyDao {
	@Autowired
	BeautyRepo beautyRepo;

	public List<Beauty> getAllBeautys(){
		return beautyRepo.findAll();
	}
	public Beauty getByName(String name){
		return beautyRepo.findByBtyName(name);
	}
	public void DeleteById(int id){
		  beautyRepo.deleteById(id);;
	}
	public Beauty updateProd(Beauty Beauty){
		return beautyRepo.save(Beauty);
	}
	public void register (Beauty prod){
		beautyRepo.save(prod);
	}
}
