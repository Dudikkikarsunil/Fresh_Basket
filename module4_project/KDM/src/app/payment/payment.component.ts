import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})
export class PaymentComponent implements OnInit{
  
  amount=0;
   @ViewChild('paymentRef',{static:true}) paymentRef!:ElementRef; // Corrected ViewChild
   constructor(private router:Router,private payment:CustomerService){}
  
  ngOnInit(): void {
    this.amount=this.payment.getTotal();
    // console.log(window.paypal);
    if (typeof window !== 'undefined') {
      // Code that relies on the window object can safely be executed here
      console.log(window.paypal);
    window.paypal. Buttons(
      {
        style:{
        layout: 'horizontal',
        color: 'blue',
        shape: 'rect',
        label:'paypal',
        },
        createOrder: (data: any, actions: any) => {
          return actions.order.create({
          purchase_units: [
          {
          amount:{
          value: this.amount.toString(),
          currency_code: 'USD'
          }
        }
      ]
          })
          },
          onApprove:(data:any,actions:any)=>{
            return actions.order.capture().then((details:any)=>{
              // console.log(details);
              if(details.status === 'completed'){
                this.payment.getTotal=details;
                this.router.navigate(['confirm']);
              }
            })
          },
          onError:(error:any)=>{
            console.log(error);
          }
      }
    ).render(this. paymentRef. nativeElement)
  } }
  cancel(){
    this.router.navigate(['cart']);
  }

  

}
