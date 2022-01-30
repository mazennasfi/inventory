package com.codeonce.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.inventory.controller.resources.RProduct;
import com.codeonce.inventory.model.Product;
import com.codeonce.inventory.services.IProductService;

import static java.util.stream.Collectors.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("codeonce/v1")
public class ProductController {

	private IProductService productService;

	@Autowired
	public ProductController(final IProductService productService) {
		this.productService = productService;

	}

	@GetMapping(value = "/{categoryCode}", produces = "application/json")
	public List<RProduct> getProducts(@PathVariable(value = "categoryCode") final String categoryCode) {

		var products = productService.productsInCategory(categoryCode);
		return toRProductList(products);

	}

	private List<RProduct> toRProductList(final List<Product> products) {
		return products.stream().map(product -> createRProduct(product)).collect(toUnmodifiableList());

	}

	private RProduct createRProduct(final Product product) {
		return new RProduct(product.getCode(), product.getProductDescription(), product.getProductPrice());
	}

}
