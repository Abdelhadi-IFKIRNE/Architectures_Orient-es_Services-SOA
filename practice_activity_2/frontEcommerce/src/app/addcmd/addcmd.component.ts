import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../services/customer.service";
import {ProductService} from "../services/product.service";
import {catchError, Observable, throwError} from "rxjs";
import {Customer} from "../models/Customer";
import {Product} from "../models/Product";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-addcmd',
  templateUrl: './addcmd.component.html',
  styleUrls: ['./addcmd.component.css']
})
export class AddcmdComponent implements OnInit {

  customers!:Observable<Array<Customer>>;
  products!:Observable<Array<Product>>;
  newOrderForm!:FormGroup;
  constructor(private customerService:CustomerService,private productService:ProductService,private fb:FormBuilder) { }

  ngOnInit(): void {
    this.createForm();
    this.getAllCustomers();
    this.getAllProducts();
  }
  public getAllCustomers(){
    this.customers=this.customerService.getAllCustomers().pipe(catchError(err => {
      return throwError(err);
    }));
  }

  public getAllProducts(){
    this.products=this.productService.getAllProducts().pipe(catchError(err => {
      return throwError(err);
    }));
  }

  public createForm(){
    this.newOrderForm=this.fb.group({
      idCustomer:this.fb.control(""),
      prodsWthQtes:this.fb.control(""),
    })
  }
}
