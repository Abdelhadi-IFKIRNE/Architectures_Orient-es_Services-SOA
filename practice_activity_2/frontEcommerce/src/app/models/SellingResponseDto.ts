import {Customer} from "./Customer";

export class SellingResponseDto{
  id!:string;
  totalHT!:number;
  date!:Date;
  customer!:Customer
}
