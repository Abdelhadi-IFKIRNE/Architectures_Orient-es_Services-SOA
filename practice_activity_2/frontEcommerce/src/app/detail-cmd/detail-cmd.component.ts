import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {OrderService} from "../services/order.service";
import {DetailOrder} from "../models/DetailOrder";
import {catchError, Observable, throwError} from "rxjs";

@Component({
  selector: 'app-detail-cmd',
  templateUrl: './detail-cmd.component.html',
  styleUrls: ['./detail-cmd.component.css']
})
export class DetailCmdComponent implements OnInit {
  idSelling!:string;
  details!:Observable<DetailOrder>;
  currentPage:number=0;
  size:number=5;
  constructor(private actRoute:ActivatedRoute,private orderService:OrderService) {
    this.idSelling=this.actRoute.snapshot.params["id"];
  }

  ngOnInit(): void {
    this.getDetails();
  }

  public getDetails(){
    this.details=this.orderService.getDetailOrder(this.idSelling,this.currentPage,this.size).pipe(catchError(err => {
      return throwError(err);
    }));
  }

  getNext(paged: number) {
    this.currentPage=paged;
    this.getDetails();
  }
}
