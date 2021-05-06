package com.bookstore.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookstore.model.DAOUser;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);

}