package com.codeonce.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "PRODUCTDESCRIPTION")
	private String productDescription;

	@Column(name = "PRODUCTPRICE")
	private double productPrice;

	@ManyToOne
	@JoinColumn(name = "ID_CATEGORY")
	private Category category;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_COMPANY")
	private Company company;

	public Product(final String productCode, final String productDescription, final double productPrice) {
		super();
		this.setCode(productCode);
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
	}

	public String getProductDescription() {
		return productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(final Company company) {
		this.company = company;
	}

	public void setProductDescription(final String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductPrice(final double productPrice) {
		this.productPrice = productPrice;
	}

}
