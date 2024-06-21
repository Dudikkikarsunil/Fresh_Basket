import { CanActivateFn, Router } from '@angular/router';
import { CustomerService } from './customer.service';
import { Injectable } from '@angular/core';

// export const authGuard: CanActivateFn = (route, state) => {
//   return true;
// };
@Injectable({   // <-- This is important
  providedIn: 'root'
})
export class AuthGuard {

  constructor(private service:CustomerService,private router :Router) {}
  isLoggedIn=false;
  canActivate(): boolean {
    // Check if the user is logged in and return true
    if(this.service.getUserLoggedStatus()){
      return true;
    }else{
      this.router.navigate(['login']);
      return false;
    }

    // else navigate to login component and return false

  }
  login() {
    // Perform login actions (e.g., authenticate user)
    this.isLoggedIn = true;
    // Redirect to home page or previous page
    this.router.navigate(['/']);
  }

  logout() {
    // Perform logout actions (e.g., clear session)
    this.isLoggedIn = false;
    // Redirect to login page
    this.router.navigate(['/login']);
  }

}

