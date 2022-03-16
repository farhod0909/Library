package com.example.library.dto;

import com.example.library.entity.Category;
import lombok.Data;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private CategoryDto parentCategory;

    public static CategoryDto toDto(Category e) {
        CategoryDto dto = new CategoryDto();
        dto.setId(e.getId());
        dto.setName(e.getName());
        if (e.getParentCategory() != null) {
            dto.setParentCategory(toDto(e.getParentCategory()));//rekursiv method bo'ldi yani o'zini ichida o'zini chaqirganimiz un chiqdi
        }
        return dto;
    }


}


