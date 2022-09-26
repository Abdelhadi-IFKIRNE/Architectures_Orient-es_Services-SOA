package org.sid.productservicegraphql.Repositories;

import org.sid.productservicegraphql.DTOs.ProductDto;
import org.sid.productservicegraphql.Entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
