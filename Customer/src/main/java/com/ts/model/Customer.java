package com.ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int CustomerId;
	private String CustomerName;
	private String Email;
	private String Password;
	private String Gender;
	private long phoneNumber;
	private String country;
	private String city;

	public Customer(){
		
	}
	
	public Customer(int customerId, String customerName, String email, String password, String gender, long phoneNumber,
			String country, String city) {
		super();
//		this.CustomerId = customerId;
		this.CustomerName = customerName;
		this.Email = email;
		this.Password = password;
		this.Gender = gender;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.city = city;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", Email=" + Email
				+ ", Password=" + Password + ", Gender=" + Gender + ", phoneNumber=" + phoneNumber + ", country="
				+ country + ", city=" + city + "]";
	}

	
	
	
}
