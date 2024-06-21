package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Vegetables;
@Repository
public interface VegetableRepo extends JpaRepository<Vegetables,Integer> {
	public Vegetables findByVegName(String name);

}
