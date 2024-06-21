package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ts.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT c FROM Customer c WHERE c.CustomerName = :name")
	Customer getCustomerByName( @Param("name")String name);

   
    @Query("SELECT c FROM Customer c WHERE c.Email = :email")
    Customer findCustomerByemail(@Param("email") String email);

    @Query("SELECT c FROM Customer c WHERE c.Password = :password")
    Customer findCustomerBypassword(@Param("password") String password);
    

	@Query(" SELECT c FROM Customer c where c.Email = :emailId and c.Password = :password")
	 Customer login(@Param("emailId") String emailId, @Param("password") String password);
}
