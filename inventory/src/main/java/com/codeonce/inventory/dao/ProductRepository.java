package com.codeonce.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codeonce.inventory.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	@Query(value = "SELECT * FROM product P JOIN inventory INV ON P.code = INV.PRODUCTID WHERE P.id_category = :x AND INV.count > 0", nativeQuery = true)
	public List<Product> getProductsByCategoryCode(@Param("x") String categoryCode);

}
