package com.example.library.dto;

import com.example.library.entity.Product;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private int price;
    private Long categoryId;
    private String photoUid;

    public static ProductDto toDto(Product e){
        return ProductDto
                .builder()
                .id(e.getId())
                .photoUid(e.getPhotoUid())
                .categoryId(e.getCategory().getId())
                .name(e.getName())
                .price(e.getPrice())
                .build();
    }
}
