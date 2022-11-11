import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddcmdComponent} from "./addcmd/addcmd.component";

const routes: Routes = [
  {path:"orders/new",component:AddcmdComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
