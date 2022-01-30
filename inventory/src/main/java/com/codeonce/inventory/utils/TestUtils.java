package com.codeonce.inventory.utils;

import com.codeonce.inventory.model.Category;
import com.codeonce.inventory.model.Company;
import com.codeonce.inventory.model.Inventory;
import com.codeonce.inventory.model.Product;

public class TestUtils {
	
	private TestUtils() {}
	
	public static Product createProduct(
			final String code,
			final String description,
			final Company company,
			final Category category,
			final double price) {
		Product product = new Product();
		product.setCode(code);
		product.setCategory(category);
		product.setCompany(company);
		product.setProductDescription(description);
		product.setProductPrice(price);
		return product;
	}
	
	public static Inventory createInventory(
			final String code,
			final Double count,
			final String productID) {
		Inventory inventory = new Inventory();
		inventory.setCode(code);
		inventory.setCount(count);
		inventory.setProductId(productID);
		return inventory;
	}

}
