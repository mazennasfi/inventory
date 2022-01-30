package com.codeonce.inventory.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeonce.inventory.dao.ProductRepository;
import com.codeonce.inventory.model.Product;
import com.codeonce.inventory.services.IProductService;

@Service
public class ProductService implements IProductService {

	private ProductRepository productRepository;

	@Autowired
	public ProductService(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> productsInCategory(final String categoryCode) {
		return productRepository.getProductsByCategoryCode(categoryCode);
	}

}
