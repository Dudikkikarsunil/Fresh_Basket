package com.ts.Customer;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.ProductDao;
import com.ts.model.Product;
@CrossOrigin(origins="*")
@RestController
public class ProductController {
	@Autowired
	ProductDao prodDao;
	@RequestMapping("/AllProds")
	public List<Product> getAllProds(){
//		List<Product> prodList=new ArrayList<Product>();
//		prodList.add(new Product(1,"laptop",150000));
		return prodDao.getAllProducts() ;
		
	}
	
	@RequestMapping("/ByName/{name}")
	public Product getByName(@PathVariable("name") String name){
		return prodDao.getByName(name);
		
	}
	@PostMapping("/prodRegister")
	public void register(@RequestBody Product prod){
		System.out.println("Data Received : "+prod);
		prodDao.register(prod);
	}
//	@RequestMapping("/deleteId/{id}")
//	public void deleteById(@PathVariable("id") int id){
//		prodDao.DeleteById(id);
//		
//	}
//	@PostMapping("update")
//	public void updateProd(@RequestBody)
	

}

