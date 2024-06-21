// import { Component, OnInit } from '@angular/core';
// import { AuthGuard } from '../auth.guard';

// @Component({
//   selector: 'app-header',
//   templateUrl: './header.component.html',
//   styleUrl: './header.component.css'
// })
// export class HeaderComponent implements OnInit {
//   constructor(public service:AuthGuard){}
//   ngOnInit(): void {
    
//   }
//   logout(){
//     this.service.logout();
//   }
//   toggleLogin() {
//     if (this.service.isLoggedIn) {
//       this.service.logout();
//     } else {
//       // Redirect to the login page or open a modal for login
//     }
// }
// }


import { Component, OnInit } from '@angular/core';
import { AuthGuard } from '../auth.guard';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'] // Corrected property name to styleUrls
})
export class HeaderComponent implements OnInit {
  constructor(public service: AuthGuard) {}

  ngOnInit(): void {}

  // logout() {
  //   this.service.logout();
  // }

  toggleLogin() {
    if (this.service.isLoggedIn) {
      this.service.logout();
    } else {
      // Redirect to the login page or open a modal for login
      this.service.login();
    }
  }
}

