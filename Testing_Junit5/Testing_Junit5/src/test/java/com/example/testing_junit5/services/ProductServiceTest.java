package com.example.testing_junit5.services;

import com.example.testing_junit5.Entities.Product;
import com.example.testing_junit5.Repositories.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;


@DataJpaTest

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private AutoCloseable autoCloseable;
    private ProductService productService;

    @BeforeEach
    void setUp() {
        autoCloseable=MockitoAnnotations.openMocks(this);
        this.productService=new ProductServiceImpl(productRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void getAllProducts() {
        productService.getAllProduct();
        verify(productRepository).findAll();
    }

    @Test
    void getProductById() {
        //given
        Product product=productRepository.findById(1l).orElse(null);
        //when
        Product expected=productService.getProductById(1l);
        //then
        assertThat(product).isEqualTo(expected);
    }

}