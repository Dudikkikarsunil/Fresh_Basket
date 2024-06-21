import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-fruits',
  templateUrl: './fruits.component.html',
  styleUrl: './fruits.component.css'
})
export class FruitsComponent {
  fruits:any;
  constructor(private service:CustomerService){

  }
  ngOnInit(): void {
    this.service.getAllFruits().subscribe((data:any)=>{
      this.fruits=data;
      // console.log(data); 
      console.log(this.fruits); //
     
    });
  }
  addToCart(product: any) {
    this.service.addToCart(product);
  }

}
