package com.anhnq.storedemo.repository;

import com.anhnq.storedemo.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    /**
     * Find role by rolename
     * @param rolename
     * @return RoleEntity
     */
    RoleEntity findByRolename(String rolename);
}
