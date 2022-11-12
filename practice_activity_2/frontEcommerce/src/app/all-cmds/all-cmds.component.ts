import { Component, OnInit } from '@angular/core';
import {OrderService} from "../services/order.service";
import {PageSellingResponseDto} from "../models/PageSellingResponseDto";
import {catchError, Observable, throwError} from "rxjs";
import {Router} from "@angular/router";

@Component({
  selector: 'app-all-cmds',
  templateUrl: './all-cmds.component.html',
  styleUrls: ['./all-cmds.component.css']
})
export class AllCmdsComponent implements OnInit {
  pageSellingResponseDto!:Observable<PageSellingResponseDto>;
  currentPage:number=0;
  size:number=5;
  idOrder:string="";
  constructor(private orderService:OrderService,private router:Router) { }

  ngOnInit(): void {
    this.getTotalPages();
  }

  public getTotalPages(){
    this.pageSellingResponseDto=this.orderService.getAllOrders(this.idOrder,this.currentPage,this.size).pipe(catchError(err => {
      return throwError(err);
    }));
  }

  getNext(paged: number) {
    this.currentPage=paged;
    this.getTotalPages();
  }

  getDetails(id: string) {
    this.router.navigateByUrl("/orders/detail/"+id);
  }
}
