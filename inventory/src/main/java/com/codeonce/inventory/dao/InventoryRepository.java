package com.codeonce.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeonce.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, String> {

}
