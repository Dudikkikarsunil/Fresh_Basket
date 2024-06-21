import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-vegetables',
  templateUrl: './vegetables.component.html',
  styleUrl: './vegetables.component.css'
})
export class VegetablesComponent {
  vegetables:any;
  constructor(private service:CustomerService){

  }
  ngOnInit(): void {
    this.service.getAllVegetables().subscribe((data:any)=>{
      this.vegetables=data;
      // console.log(data); 
      console.log(this.vegetables); //
     
    });
  }

  addToCart(product: any) {
    this.service.addToCart(product);
  }

}
