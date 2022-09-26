package org.sid.productservicegraphql.web;


import lombok.AllArgsConstructor;
import org.sid.productservicegraphql.DTOs.ProductDTOs;
import org.sid.productservicegraphql.DTOs.ProductDto;
import org.sid.productservicegraphql.Entities.Product;
import org.sid.productservicegraphql.Repositories.ProductRepository;
import org.sid.productservicegraphql.Services.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Controller
@AllArgsConstructor
@CrossOrigin("*")
public class ProductGraphQlController {
    private ProductRepository productRepository;
    private IProductService productService;
    @QueryMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    @QueryMapping
    public Product getProductById(@Argument Long id){
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
    }

    @MutationMapping
    public Product saveNewProduct(@Argument ProductDTOs product){
       return productService.saveNewProduct(product);
    }
}
