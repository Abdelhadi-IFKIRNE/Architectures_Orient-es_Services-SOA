import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddcmdComponent} from "./addcmd/addcmd.component";
import {AllCmdsComponent} from "./all-cmds/all-cmds.component";
import {DetailCmdComponent} from "./detail-cmd/detail-cmd.component";

const routes: Routes = [
  {path:"orders/new",component:AddcmdComponent},
  {path:"orders/all",component:AllCmdsComponent},
  {path:"orders/detail/:id",component:DetailCmdComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
