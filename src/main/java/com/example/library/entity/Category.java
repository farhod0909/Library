package com.example.library.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Category extends BaseEntity {

    @Column(length = 128)
    private String name;

    @ManyToOne
    private Category parentCategory;

    @Column(columnDefinition = "TEXT")
    private String photo;

}
