import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Customer} from "../models/Customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  public getAllCustomers():Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>(environment.backendGWUrl+"/customer-service/customers/all")
  }
}
