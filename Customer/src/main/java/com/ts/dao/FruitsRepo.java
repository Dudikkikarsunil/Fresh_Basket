package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Fruits;
@Repository
public interface FruitsRepo extends JpaRepository<Fruits,Integer> {
	public Fruits findByFrtName(String name);
}
