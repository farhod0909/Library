package com.example.library.cantroller;

import com.example.library.dto.CategoryDto;
import com.example.library.dto.CategoryForm;
import com.example.library.service.CategoryServive;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/library")
@RequiredArgsConstructor
public class CategoryCantroller {
    private final CategoryServive service;

    @GetMapping
    public ResponseEntity findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CategoryDto findOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    public CategoryDto add(@RequestBody CategoryForm form) {
        return service.add(form);
    }

    @PutMapping("/{id}")
    public CategoryDto update(@RequestBody CategoryForm form, @PathVariable Long id) {
        return service.update(form,id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }



}




