package org.sid.productservicegraphql.DTOs;


import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String description;
}
