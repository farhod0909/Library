package com.example.library.service;

import com.example.library.dto.CategoryDto;
import com.example.library.dto.CategoryForm;
import com.example.library.entity.Category;
import com.example.library.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service

public class CategoryServive implements ICategoryService {
    private final CategoryRepository repository;

    public CategoryServive(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public CategoryDto add(CategoryForm form) {// form bilan ishlaymiz Dto berib yuboraolmaymiz to'gridan-to'gri
        Category category = new Category();//formni ichidan tekshirib oldik to'grimi yoki xatomi
        category.setName(form.getName());
        if (form.getParentId() != null) {
            Category parent = repository.findById(form.getParentId()).orElseThrow(() -> new RuntimeException("Parent Category not found"));
            category.setParentCategory(parent);
        }

        return CategoryDto.toDto(repository.save(category));
    }

    @Override
    public CategoryDto update(CategoryForm form, Long id) {
        Category category = repository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        category.setName(form.getName());
        if (form.getParentId() != null) {
            Category parent = get(id);
            category.setParentCategory(parent);
        }
        return CategoryDto.toDto(repository.save(category));

    }


    @Override
    public CategoryDto findOne(Long id) {
        return CategoryDto.toDto(get(id));
    }

    @Override
    public ResponseEntity findAll() {
        if (true){
            ResponseEntity.badRequest().body("Kechirasiz sizga kirishga ruqsat yoq!");
        }
        return ResponseEntity.ok(repository.findAllByDeletedFalse()
                .stream()
                .map(CategoryDto::toDto)
                .collect(Collectors.toList()));
    }

    @Override
    public void delete(Long id) {
        Category category = get(id);
        category.setDeleted(true);//yani o'chirildi degan ma'noni beradi!
        repository.save(category);
    }


    private Category get(Long id) {
        return repository.findByIdAndDeletedFalse(id).orElseThrow(() -> new RuntimeException("Category not found"));
//Deleted true bo'lsa topa olamaydi!
    }
}
