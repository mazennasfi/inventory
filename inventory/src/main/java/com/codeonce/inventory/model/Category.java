package com.codeonce.inventory.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "CATEGORYDESCRIPTION")
	private String categoryDescription;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Product> allProducts;

	public Category(final String categoryCode, final String categoryDescription) {
		super();
		this.setCode(categoryCode);
		this.categoryDescription = categoryDescription;
	}

	public Category() {
		super();
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public List<Product> getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(final List<Product> allProducts) {
		this.allProducts = allProducts;
	}
}
