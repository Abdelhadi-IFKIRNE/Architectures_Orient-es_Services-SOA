import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Customer} from "../models/Customer";
import {CustomerPages} from "../models/CustomerPages";
import {CustomerRequestDto} from "../models/CustomerRequestDto";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  public getAllCustomers():Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>(environment.backendGWUrl+"/customer-service/customers/all")
  }

  public getCustomerPges(id:string,page:number,size:number):Observable<CustomerPages>{
    return  this.http.get<CustomerPages>(environment.backendGWUrl+"/customer-service/customers/pages?id="+id+"&&page="+page+"&&size="+size);
  }

  public saveCustomer(customer:CustomerRequestDto){
    return this.http.post(environment.backendGWUrl+"/customer-service/customers/add",customer);
  }
}
