package com.ts.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
public Product findByProdName(String name);
}