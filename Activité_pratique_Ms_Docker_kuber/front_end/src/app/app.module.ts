import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AddcustomerComponent } from './addcustomer/addcustomer.component';
import { AddinvoiceComponent } from './addinvoice/addinvoice.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import {RouterModule, Routes} from "@angular/router";
const routes: Routes = [
  {path:"invoices/add",component:AddinvoiceComponent},
  {path:"customers/add",component:AddcustomerComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    AddcustomerComponent,
    AddinvoiceComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes),
  ],
  exports:[RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
