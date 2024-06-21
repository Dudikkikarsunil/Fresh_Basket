package com.ts.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Customer;

@Service
public class CustomerDAO {

	@Autowired
	private CustomerRepository custRepo;

	public void register(Customer customer) {
		custRepo.save(customer);
	}


	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return custRepo.findById(id).get(); 
	}

	public Customer updateCustomer( Customer customer) {  
		return custRepo.save(customer);
	}
	public void deleteCustomerById(int id){
		custRepo.deleteById(id);
	}

	public Customer getCustomerByName(String name) {
		return custRepo.getCustomerByName(name) ;
	}

	public Customer getCustomerByemail(String email) {
		return custRepo.findCustomerByemail(email);
	}

	public Customer getCustomerBypassword(String password) {
		return custRepo.findCustomerBypassword(password) ;
	}
	public Customer login(String emailId, String password) {
	    return custRepo.login(emailId, password);
	}
}