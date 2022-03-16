package com.example.library.service;

import com.example.library.dto.CategoryDto;
import com.example.library.dto.CategoryForm;
import org.springframework.http.ResponseEntity;

public interface ICategoryService {
    CategoryDto add(CategoryForm form);//save qilishda biz CategoryDto dan foydalanmaymiz chunki u yerda parentCategory bor bizga perentId kerak bo'ladi shuni esdan chiqarma

    CategoryDto update(CategoryForm form,Long id);

    CategoryDto findOne(Long id);

    ResponseEntity findAll();

    void delete(Long id);


}
