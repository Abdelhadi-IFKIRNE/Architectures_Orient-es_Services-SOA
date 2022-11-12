import {Customer} from "./Customer";
import {ProductResponseDto} from "./ProductResponseDto";

export class DetailOrder{
  nbPages!:number;
  customer!:Customer;
  productResponseDtos!:[ProductResponseDto]
}
