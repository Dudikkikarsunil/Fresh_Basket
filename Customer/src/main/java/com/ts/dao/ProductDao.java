package com.ts.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Product;
@Service
public class ProductDao {
	@Autowired
	ProductRepo prodRepo;
//	public Product getById(int id){
//		return prodRepo.findById(id);
//		
//	}
	public List<Product> getAllProducts(){
		return prodRepo.findAll();
	}
	public Product getByName(String name){
		return prodRepo.findByProdName(name);
	}
	public void DeleteById(int id){
		  prodRepo.deleteById(id);;
	}
	public Product updateProd(Product product){
		return prodRepo.save(product);
	}
	public void register (Product prod){
		prodRepo.save(prod);
	}
	
}


