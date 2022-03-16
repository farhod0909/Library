package com.example.library.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class Category1 extends BaseEntity {
    private String name;
    @ManyToOne
    private Category1 parentCategory;
    private Date createdDate;




}
