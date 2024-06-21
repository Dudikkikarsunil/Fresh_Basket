import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-confirm',
  templateUrl: './confirm.component.html',
  styleUrl: './confirm.component.css'
})
export class ConfirmComponent {
  transactionId ="";

  constructor(private payment:CustomerService){}
  ngOnInit(): void {
    this.transactionId=this.payment.getTotal();
  }
}
