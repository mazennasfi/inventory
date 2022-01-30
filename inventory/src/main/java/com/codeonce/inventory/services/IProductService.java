package com.codeonce.inventory.services;

import java.util.List;

import com.codeonce.inventory.model.Product;

public interface IProductService {

	List<Product> productsInCategory(String categoryCode);

}
