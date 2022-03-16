package com.example.library.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Data
@Entity
public class Category extends BaseEntity {
    private String name;
    @ManyToOne
    private  Category parentCategory;
    private Date createdDate;




}
