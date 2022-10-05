package com.example.testing_junit5.Repositories;

import com.example.testing_junit5.Entities.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private  ProductRepository productRepository;
    @Test
    void isFindByDescription() {

        //given
        Product product=new Product();
        product.setDescription("test");
        product.setPrice(Math.random()*7000);
        productRepository.save(product);
        //when
        Product expected=productRepository.findByDescription("test");
        //then
        assertThat(product).isEqualTo(expected);
    }
}