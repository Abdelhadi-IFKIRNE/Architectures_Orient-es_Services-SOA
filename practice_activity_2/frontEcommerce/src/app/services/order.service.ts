import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {SellingRequestDto} from "../models/SellingRequestDto";
import {environment} from "../../environments/environment";
import {Observable} from "rxjs";
import {SellingResponseDto} from "../models/SellingResponseDto";
import {PageSellingResponseDto} from "../models/PageSellingResponseDto";
import {DetailOrder} from "../models/DetailOrder";

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http:HttpClient) { }

  public saveOrder(sellingRequestDto:SellingRequestDto){
    return this.http.post(environment.backendGWUrl+"/selling-service/selling/add",sellingRequestDto);
  }

  public getAllOrders(id:string,page:number,size:number):Observable<PageSellingResponseDto>{
    return this.http.get<PageSellingResponseDto>(environment.backendGWUrl+"/selling-service/selling/pages?id="+id+"&&page="+page+"&&size="+size);
  }

  public getDetailOrder(id:string,page:number,size:number):Observable<DetailOrder>{
    return this.http.get<DetailOrder>(environment.backendGWUrl+"/selling-service/selling/detail?id="+id+"&&page="+page+"&&size="+size);
  }
}
