package com.codeonce.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeonce.inventory.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
