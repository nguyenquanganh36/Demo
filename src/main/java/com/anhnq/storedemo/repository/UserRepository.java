package com.anhnq.storedemo.repository;

import com.anhnq.storedemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    /**
     * Find user by username
     * @param username
     * @return UserEntity
     */
    UserEntity findByUsername(String username);

    /**
     * Check exists an user by username
     * @param username
     * @return Boolean
     */
    Boolean existsByUsername(String username);

    /**
     * Check exits an user email
     * @param email
     * @return Boolean
     */
    Boolean existsByEmail(String email);
}
