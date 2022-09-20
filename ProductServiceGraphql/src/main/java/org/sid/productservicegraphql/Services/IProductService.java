package org.sid.productservicegraphql.Services;

import org.sid.productservicegraphql.DTOs.ProductDTOs;
import org.sid.productservicegraphql.Entities.Product;

public interface IProductService {
    public Product saveNewProduct(ProductDTOs productDTOs);
}
