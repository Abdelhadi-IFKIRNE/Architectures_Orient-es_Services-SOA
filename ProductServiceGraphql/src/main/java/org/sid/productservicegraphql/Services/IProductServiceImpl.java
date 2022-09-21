package org.sid.productservicegraphql.Services;

import lombok.AllArgsConstructor;
import org.sid.productservicegraphql.DTOs.ProductDTOs;
import org.sid.productservicegraphql.Entities.Category;
import org.sid.productservicegraphql.Entities.Product;
import org.sid.productservicegraphql.Repositories.CategoryRepository;
import org.sid.productservicegraphql.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IProductServiceImpl implements IProductService {
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    @Override
    public Product saveNewProduct(ProductDTOs productDTOs) {
        Category category=categoryRepository.findById(productDTOs.idCategory()).orElseThrow(()->new RuntimeException(String.format("Error category %d Not found....!",productDTOs.idCategory())));
        Product product= Product.builder()
                .name(productDTOs.name())
                .description(productDTOs.description())
                .category(category).build();
       return productRepository.save(product);
    }
}
