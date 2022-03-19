package com.example.library.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class OrderProduct extends BaseEntity {
    private int count;
    @OneToOne
    private Product product;
}
