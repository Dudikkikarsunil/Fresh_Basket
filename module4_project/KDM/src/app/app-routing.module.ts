import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { AdminComponent } from './admin/admin.component';
import { ProductComponent } from './product/product.component';
import { VegetablesComponent } from './vegetables/vegetables.component';
import { BeautyComponent } from './beauty/beauty.component';
import { FruitsComponent } from './fruits/fruits.component';
import { CartComponent } from './cart/cart.component';
import { AboutComponent } from './about/about.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuard } from './auth.guard';
import { PaymentComponent } from './payment/payment.component';
import { ConfirmComponent } from './confirm/confirm.component';



const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'admin',component:AdminComponent},
  {path:'products',component:ProductComponent},
  {path:'veg',component:VegetablesComponent},
  {path:'beauty',component:BeautyComponent},
  {path:'fruits',component:FruitsComponent},
  {path:'cart',component:CartComponent,canActivate:[AuthGuard]},
  {path:'about',component:AboutComponent},
  {path :'logout',component:LogoutComponent},
  {path:'payment',component:PaymentComponent},
  {path:'confirm',component:ConfirmComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
