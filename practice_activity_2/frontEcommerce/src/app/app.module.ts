import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddcmdComponent } from './addcmd/addcmd.component';
import {HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import {NgSelectModule} from "@ng-select/ng-select";
import { AllCmdsComponent } from './all-cmds/all-cmds.component';
import { DetailCmdComponent } from './detail-cmd/detail-cmd.component';

@NgModule({
  declarations: [
    AppComponent,
    AddcmdComponent,
    AllCmdsComponent,
    DetailCmdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    NgSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
