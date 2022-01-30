package com.codeonce.inventory.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.codeonce.inventory.dao.ProductRepository;
import com.codeonce.inventory.model.Product;
import com.codeonce.inventory.services.impl.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductService productService;

	@Test
	void testProductsInCategory() {

		Product product1 = new Product("P1", "This is a description of product P1", 50d);

		Product product2 = new Product("P1", "This is a description of product P1", 50d);
		List<Product> productsOfCategory777 = List.of(product1, product2);

		when(productRepository.getProductsByCategoryCode("777")).thenReturn(productsOfCategory777);

		List<Product> actualProducts = productService.productsInCategory("777");

		assertEquals(productsOfCategory777, actualProducts);
	}

}
