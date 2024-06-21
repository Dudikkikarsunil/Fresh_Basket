import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent {
  
  constructor(public cartService: CustomerService,private  router:Router) {
  }
      



  deleteFromCart(item: any) {
    this.cartService.delete(item);
  }
  purchase() {
   
    this.router.navigate(['payment']);
  }
 

}
