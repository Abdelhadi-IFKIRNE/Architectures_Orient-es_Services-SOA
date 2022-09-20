package org.sid.productservicegraphql.Repositories;

import org.sid.productservicegraphql.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
