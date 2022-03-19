package com.example.library.service;

import com.example.library.dto.CategoryDto;
import com.example.library.dto.CategoryForm;
import org.springframework.http.ResponseEntity;


public interface CategoryService {
    CategoryDto add(CategoryForm form);

    CategoryDto update(Long id, CategoryForm form);

    CategoryDto findOne(Long id);

    ResponseEntity findAll();

    void delete(Long id);
}
