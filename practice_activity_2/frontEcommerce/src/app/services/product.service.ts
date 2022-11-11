import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Product} from "../models/Product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }

  public getAllProducts():Observable<Array<Product>>{
    return this.http.get<Array<Product>>(environment.backendGWUrl+"/inventory-service/products/all")
  }
}
