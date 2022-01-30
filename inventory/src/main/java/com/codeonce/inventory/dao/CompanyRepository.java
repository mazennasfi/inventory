package com.codeonce.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeonce.inventory.model.Company;

public interface CompanyRepository extends JpaRepository<Company, String> {

}
