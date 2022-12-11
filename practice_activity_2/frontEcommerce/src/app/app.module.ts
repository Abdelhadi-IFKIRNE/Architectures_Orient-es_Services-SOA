import {APP_INITIALIZER, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddcmdComponent } from './addcmd/addcmd.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import {NgSelectModule} from "@ng-select/ng-select";
import { AllCmdsComponent } from './all-cmds/all-cmds.component';
import { DetailCmdComponent } from './detail-cmd/detail-cmd.component';
import { CustomersComponent } from './customers/customers.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import {KeycloakAngularModule, KeycloakService} from "keycloak-angular";

export function keycloaklancher(kyService:KeycloakService){
  return ()=>{
    kyService.init({
      config:{
        realm:"E-commerce",
        clientId:"ecomerce-service",
        url:"http://localhost:8080"
      },
      initOptions:{
        onLoad:"login-required",
        checkLoginIframe:true
      }
    })
  }
}
@NgModule({
  declarations: [
    AppComponent,
    AddcmdComponent,
    AllCmdsComponent,
    DetailCmdComponent,
    CustomersComponent,
    AddCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgSelectModule,
    KeycloakAngularModule
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: keycloaklancher,
      multi: true,
      deps: [KeycloakService]
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
