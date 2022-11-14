import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {CustomerService} from "../services/customer.service";

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
   formCustomer!:FormGroup;
  constructor(private fb:FormBuilder,private customerService:CustomerService) { }

  ngOnInit(): void {
    this.formCustomer=this.fb.group({
      name:this.fb.control(""),
      email:this.fb.control(""),
    })
  }

  saveCustomer() {
    let CustomerRequestDto=this.formCustomer.value;
    this.customerService.saveCustomer(CustomerRequestDto).subscribe({
      next:(data)=>{
        console.log(data);
      },
      error:(err)=>{
        console.log(err);
      }
    })
  }
}
