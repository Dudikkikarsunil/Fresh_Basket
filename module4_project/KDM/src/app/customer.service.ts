import { isPlatformBrowser } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Inject, Injectable, PLATFORM_ID, inject } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private items:any=[];
  isUserLoggedIn:boolean;

  constructor(private http : HttpClient,@Inject(PLATFORM_ID)private platformId: Object,private router:Router) {
    this.isUserLoggedIn=false;
    
    if (isPlatformBrowser(this.platformId)) {
      this.items = JSON.parse(localStorage.getItem('cartItems') || '[]');
    } else {
      this.items = []; // Initialize items to an empty array in non-browser environments
    }
    
  }

  setUserLoggedIn(){
    this.isUserLoggedIn =true;
  }
  getUserLoggedStatus():boolean{
    return this.isUserLoggedIn;
  }
  setUserLogout() {
   this.isUserLoggedIn = false;

  } 
  
  getAllCustomers():any{
    return this.http.get("http://localhost:8085/getAllCustomers")
  }
  getAllCountires():any {
    return this.http.get("https://restcountries.com/v3.1/all")
  }

  registerUser(formData: any): any {
    const url = 'http://localhost:8085/register';
    return this.http.post(url, formData);
  }

  getAllProducts():any{
    return this.http.get("http://localhost:8085/AllProds");
  }
  getAllVegetables():any{
    return this.http.get("http://localhost:8085/allVegetables");
  }
  getAllFruits():any{
    return this.http.get("http://localhost:8085/allFruits");
  }
  getAllBeauty():any{
    return this.http.get("http://localhost:8085/allBeauty");
  }
  deleteCustomer(customerId: any): any {
    return this.http.delete("http://localhost:8085/deleteCustomerbyid/" + customerId)
  }
  updatecustomer(customers:any){
   
    const url=("http://localhost:8085/updateCustomer/"+customers.customerId);
    return this.http.put(url,customers);
  }
  getAllCountries():any{
    return this.http.get(" https://restcountries.com/v3.1/all")
  }

  
  addToCart(product: any) {
    this.items.push({ ...product, quantity: 1 });
    if (isPlatformBrowser(this.platformId)) {
      // this.router.navigate(['login'])
      localStorage.setItem('cartItems', JSON.stringify(this.items));
    }
  }
  
  
  getItems(){
    return this.items;
  }
  clearCartItems() {
    this.items = [];
  }
  
  // delete(item: any) {
  //   this.items = this.items.filter((i) => i.id !== item.id);
  //   }

  delete(item: any) {
    this.items = this.items.filter((i: any) => i.id !== item.id); // Explicitly type 'i'
  }
  


    incrementQuantity(id: number) {
      let item = this.items.find((i: any) => i.id === id); // Explicitly type 'i'
      if (item) {
        item.quantity++;
      }
      localStorage.setItem('cartItems', JSON.stringify(this.items));
    }
    
    decrementQuantity(id: number) {
      let item = this.items.find((i: any) => i.id === id); // Explicitly type 'i'
      if (item) {
        item.quantity--;
      }
      localStorage.setItem('cartItems', JSON.stringify(this.items));
    }
    
 
  
 


    getTotal() {
      return this.items.reduce((acc: number, item: any) => {
        return acc + item.price * item.quantity;
      }, 0);
    }
    
  


}
