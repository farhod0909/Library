package com.example.library.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Product extends BaseEntity {
    private String name;
    private int price; //bilasan 0 ga teng boladi





}
