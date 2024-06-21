package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Beauty;
@Repository
public interface BeautyRepo extends JpaRepository<Beauty,Integer>{
	public Beauty findByBtyName(String btyName);

}
