import { Component } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrl: './logout.component.css'
})
export class LogoutComponent {
  constructor(private service:CustomerService,private router:Router){
    service.setUserLogout();
    console.log("staus : "+this.service.getUserLoggedStatus())
    router.navigate(['login']);
  
  }
}
