package com.ts.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.CustomerDAO;
import com.ts.model.Customer;
@CrossOrigin(origins="*")
@RestController
public class CustomerController {
	@Autowired
	private CustomerDAO costdao;
	
	public List<Customer> showAllEMployees() {
		return costdao.getAllCustomers(); 
		
	}
	@CrossOrigin(origins = "http://localhost:4200/")
	@PostMapping("register")
	public void register(@RequestBody Customer customer) {
		System.out.println("data recived :" + customer);
		costdao.register(customer);
		
	}
	@GetMapping("getAllCustomers")
	public List<Customer> getAllCustomers(){
		return costdao.getAllCustomers();
		
	}
	
	@GetMapping("getCustomerById/{id}")
	public Customer getEmployeeById(@PathVariable int id) {
		return costdao.getCustomerById(id);
	}
     
//	@PutMapping("update")
//	public Customer update(Customer employee) {
//		return costdao.update(employee);
//	}
	@PutMapping("updateCustomer/{customerId}")
	public Customer updateCustomer( @PathVariable int customerId ,@RequestBody Customer customer) {
		customer.setCustomerId(customerId);
		return costdao.updateCustomer(customer);
	}
    @DeleteMapping("deleteCustomerbyid/{id}")
	public String deleteCustomerById (@PathVariable int id){
    	costdao.deleteCustomerById(id);
		 return "Product with product id " + id + " is deleted.";
	}
	@GetMapping("getCustomerByName/{name}")
	public Customer getEmployeeByName( @PathVariable String name){ 
		return costdao.getCustomerByName(name);
		
	}
	@GetMapping("getCustomerByemail/{email}")
	public Customer getEmployeeByemail( @PathVariable String email){
		return costdao.getCustomerByemail(email);
	}
	
	@GetMapping("getCustomerBypassword/{password}")
	public Customer getEmployeeBypassword( @PathVariable String password){
		return costdao.getCustomerBypassword(password);
	}
	
	@CrossOrigin(origins = "http://localhost:4200/")
	@GetMapping("/login/{emailId}/{password}")
	public Customer login(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {
	    return costdao.login(emailId, password);
	}

}

