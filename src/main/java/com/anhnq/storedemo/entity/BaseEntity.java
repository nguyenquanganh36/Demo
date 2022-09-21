package com.anhnq.storedemo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @CreatedBy
    private String createBy;
    @Column
    @CreatedDate
    private Date createDate;
    @Column
    @LastModifiedBy
    private String modifiedBy;
    @Column
    @LastModifiedDate
    private Date modifiedDate;

}
