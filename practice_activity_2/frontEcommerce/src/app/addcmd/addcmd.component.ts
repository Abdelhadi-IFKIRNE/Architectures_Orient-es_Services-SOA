import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../services/customer.service";
import {ProductService} from "../services/product.service";
import {catchError, Observable, throwError} from "rxjs";
import {Customer} from "../models/Customer";
import {Product} from "../models/Product";
import {FormBuilder, FormGroup} from "@angular/forms";
import {SellingRequestDto} from "../models/SellingRequestDto";
import {OrderService} from "../services/order.service";
import {ProdWithQtes} from "../models/ProdWithQtes";

@Component({
  selector: 'app-addcmd',
  templateUrl: './addcmd.component.html',
  styleUrls: ['./addcmd.component.css']
})
export class AddcmdComponent implements OnInit {

  customers!:Observable<Array<Customer>>;
  products!:Observable<Array<Product>>;
  newOrderForm!:FormGroup;
  newIdsQte!:FormGroup;
  prodwithQtes:Array<ProdWithQtes>=[];
  constructor(private customerService:CustomerService,
              private productService:ProductService,
              private fb:FormBuilder,
              private orderService:OrderService) { }

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
      prodWithQtes:this.fb.control(""),
    })
    this.newIdsQte=this.fb.group({
      id:this.fb.control(""),
      qteCmd:this.fb.control(""),
    })
  }


  public saveOrder(){
    let sellingRequestDto:SellingRequestDto=new SellingRequestDto();
    sellingRequestDto.idCustomer=this.newOrderForm.value.idCustomer;
    sellingRequestDto.prodWithQtes=this.prodwithQtes;
    this.orderService.saveOrder(sellingRequestDto).subscribe({
      next:(data)=>{
        console.log(data);
        this.newOrderForm.reset();
      },
      error:(err)=>{
        console.log(err);
      }
    })
  }

  addToPanier() {
    let ProdWithQtes=this.newIdsQte.value;
    this.prodwithQtes.push(ProdWithQtes);
    this.newIdsQte.reset();
  }
}
