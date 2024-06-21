import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-beauty',
  templateUrl: './beauty.component.html',
  styleUrl: './beauty.component.css'
})
export class BeautyComponent {
  beautyProds:any;
  constructor(private service:CustomerService){

  }
  ngOnInit(): void {
    this.service.getAllBeauty().subscribe((data:any)=>{
      this.beautyProds=data;
      // console.log(data); 
      console.log(this.beautyProds); //
     
    });
  }

  addToCart(product: any) {
    this.service.addToCart(product);
  }
}
