package com.codeonce.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeonce.inventory.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
