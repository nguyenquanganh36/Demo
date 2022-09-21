package com.anhnq.storedemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "role")
public class RoleEntity extends BaseEntity{
    @Column
    private String rolename;
    @Column
    private String rolecode;
    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();
}
