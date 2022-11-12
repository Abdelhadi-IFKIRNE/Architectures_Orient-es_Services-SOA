import {ProdWithQtes} from "./ProdWithQtes";

export class SellingRequestDto {
  idCustomer!:string;
  prodWithQtes:Array<ProdWithQtes>=[];
}

