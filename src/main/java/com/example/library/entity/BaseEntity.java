package com.example.library.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

//@MappedSuperclass/->manashu entityni ichidagi malumotini boshqa entitylar ko'rish uchun yoziladi!@
//MappedSuperclass->xotiralangan
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate //oxiri qaysi vaqtda o'zgartirilganini bilib berib turadi
    private Date updatedDate;
    //    @CreatedBy
//    private String username;
//    @LastModifiedBy
//    private String editBy; bunda qaysi user update qiligani change qilinganini ko'rish mumkun lekin biz xozir buni ishata olamaymiz
    //chinli xali securty qo'shilmagan!
    //@ColumnDefault(value = "false")
    private Boolean deleted=false;//


}








