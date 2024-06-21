import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

// @Component({
//   selector: 'app-admin',
//   templateUrl: './admin.component.html',
//   styleUrl: './admin.component.css'
// })
@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})

export class AdminComponent implements OnInit{
  customers:any;
  selectedCustomer:any={};
  constructor(private service :CustomerService){

  }
   ngOnInit(): void {
     this.service.getAllCustomers().subscribe((data:any)=>{
    this.customers=data;
    // console.log(data); 
    console.log(this.customers); //
   
  });
}
// deleteEmp(empId: any) {
//   this.service.deleteCustomer(empId).subscribe((data: any) => {
//     console.log(data);
//   });

//   const i = this.customers.findIndex((customer: any) => {
//     return customer.empId == empId;
//   });
//   //for(int i=0;i<this.employess;i++){
// //return employees.id==empId;
//  // }

//   this.customers.splice(i, 1);

// }
deleteEmp(customerId: any) {
  // Remove the customer from the database
  this.service.deleteCustomer(customerId).subscribe((data: any) => {
    console.log(data);
  });

  // Find the index of the customer to delete
  const index = this.customers.findIndex((customer: any) => customer.customerId === customerId);
  if (index !== -1) {
    // If found, remove the customer from the array
    this.customers.splice(index, 1);
  } else {
    console.error("Customer not found!"); // Log an error if the customer is not found
  }
}

selectCustomer(customer: any) {
  this.selectedCustomer = { ...customer }; // Using spread operator to create a copy of the selected customer
}

// updateCustomer() {
//   this.service.updatecustomer(this.selectedCustomer).subscribe((data: any) => {
//     console.log(data);
//     // this.getCustomers(); // Refresh customers list after update
//   });
// }
updateCustomer() {
  this.service.updatecustomer(this.selectedCustomer).subscribe((data: any) => {
    console.log(data);
    // Assuming you want to refresh the customers list after update
    this.service.getAllCustomers().subscribe((updatedData: any) => {
      this.customers = updatedData;
    });
  });
}


}
