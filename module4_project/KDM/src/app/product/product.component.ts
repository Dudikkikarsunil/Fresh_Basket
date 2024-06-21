import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent implements OnInit{
  products:any;
  constructor(private service:CustomerService){

  }
  ngOnInit(): void {
    this.service.getAllProducts().subscribe((data:any)=>{
      this.products=data;
      // console.log(data); 
      console.log(this.products); //
     
    });
  }

  addToCart(product: any) {
    this.service.addToCart(product);
  }

}
