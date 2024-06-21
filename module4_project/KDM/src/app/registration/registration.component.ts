// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-registration',
//   templateUrl: './registration.component.html',
//   styleUrl: './registration.component.css'
// })
// export class RegistrationComponent {

// }
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CustomerService } from '../customer.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent  implements OnInit {
   userData = { userId: '', email: '', password: '', confirmPassword: '', customerName: '', gender: '', country: '',phoneNumber:'',city:'' };
   countries:any;
   sitekey: string = '6LeMDJopAAAAAGvWc1nXxlW1TQSbk-evxbQ1jjqF';
   captchaValid: boolean = false;
  constructor(private http: HttpClient,private service :CustomerService,private toastr: ToastrService,private router:Router) {}
  ngOnInit(): void {
    this.service.getAllCountries().subscribe((data:any)=>{
      this.countries=data;
      // console.log(data);  
    });
  }

  registerUser(): void {
    this.http.post<any>('http://localhost:8085/register', this.userData).subscribe(
      response => {
        console.log('Registration successful:', response);
        this.router.navigate(['login'])
        // Optionally, you can reset the form after successful registration
        // this.registrationForm.resetForm();
      },
      error => {
        console.error('Registration error:', error);
      }
    );
  }
  // handleCaptchaResolved(response: string): void {
  //   this.captchaValid = true;
  // }
  handleCaptchaResolved(response: string): void {
    this.captchaValid = true;
  }
  
 
}
