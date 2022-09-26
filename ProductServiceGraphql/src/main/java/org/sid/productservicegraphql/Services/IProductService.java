package org.sid.productservicegraphql.Services;

import org.sid.productservicegraphql.DTOs.ProductDTOs;
import org.sid.productservicegraphql.DTOs.ProductDto;
import org.sid.productservicegraphql.Entities.Product;
import org.springframework.data.domain.Page;

public interface IProductService {
    public Product saveNewProduct(ProductDTOs productDTOs);

}
