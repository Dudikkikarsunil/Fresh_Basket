import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerService } from '../customer.service';
import { ToastrService } from 'ngx-toastr';
import { timeout } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
//   email:any="admin";
// password:any="admin";
email: any = "";
  password: any = "";
customers: any[] = [];;
constructor(private router :Router,private service : CustomerService,private toastr: ToastrService){

}
ngOnInit(): void {
  this.service.getAllCustomers().subscribe((data:any)=>{
 this.customers=data;
 // console.log(data); 
 console.log(this.customers); //

});
}

// loginValidate(form: any): void {
//   console.log(form);
//   // Your login validation logic goes here
//   if(this.email==="admin" && this.password==="admin"){
//     console.log("welcome")
//     alert("login succesfull")
//     // this.service.setUserLoggedIn();
//     // console.log("status : "+this.service.getUserLoggedStatus());
//     this.router.navigate(['admin'])
//   }else {
//    for(let i =0;i<this.customers;i++){
//     if(form.email==this.customers[i].email && form.password==this.customers[i].password){
//       this.router.navigate(['register'])
//     }else{
//       alert("invalid username or password")
//     }

//    }

//   }
// }
loginValidate(form: any): void {
  console.log(form);
  
  if (this.email === "admin" && this.password === "admin") {
    console.log("welcome")
    // alert("Login successful")
    this.service.setUserLoggedIn();
    console.log("status : "+this.service.getUserLoggedStatus());
    this.router.navigate(['admin'])
    this.toastr.success("login success")
  } else {
    let found = false;
    for (let i = 0; i < this.customers.length; i++) {
      if (form.email === this.customers[i].email && form.password === this.customers[i].password) {
        found = true;
        this.service.setUserLoggedIn();
      console.log("status : "+this.service.getUserLoggedStatus());
        this.toastr.success("login successfully  "+ this.customers[i].email)
        break;
      }
      // this.toastr.error("welcome to");
    }
    if (found) {
      this.router.navigate(['cart']);
      // this.toastr.success("login successfully")
      timeout:500;

    } else {
      // alert("Invalid username or password");
      
      this.toastr.error("invalid user name")
    }
  }
}


}
