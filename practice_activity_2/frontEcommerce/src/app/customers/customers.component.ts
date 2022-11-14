import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../services/customer.service";
import {catchError, Observable, throwError} from "rxjs";
import {CustomerPages} from "../models/CustomerPages";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {
   customers!:Observable<CustomerPages>;
   currentPage:number=0;
   size:number=5;
   id:string="";
  constructor(private customerService:CustomerService) { }

  ngOnInit(): void {
    this.getCustomerPages();
  }

  public getCustomerPages(){
    this.customers=this.customerService.getCustomerPges(this.id,this.currentPage,this.size).pipe(catchError(err => {
      return throwError(err);
    }));
  }

  getNext(paged: number) {
    this.currentPage=paged;
    this.getCustomerPages();
  }
}
