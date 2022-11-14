import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddcmdComponent} from "./addcmd/addcmd.component";
import {AllCmdsComponent} from "./all-cmds/all-cmds.component";
import {DetailCmdComponent} from "./detail-cmd/detail-cmd.component";
import {CustomersComponent} from "./customers/customers.component";
import {AddCustomerComponent} from "./add-customer/add-customer.component";

const routes: Routes = [
  {path:"orders/new",component:AddcmdComponent},
  {path:"orders/all",component:AllCmdsComponent},
  {path:"orders/detail/:id",component:DetailCmdComponent},
  {path:"customers/all",component:CustomersComponent},
  {path:"customers/new",component:AddCustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
