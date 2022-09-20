package org.sid.productservicegraphql.DTOs;

public record ProductDTOs(
        String name,
        String description,
        Long idCategory
) {
}
