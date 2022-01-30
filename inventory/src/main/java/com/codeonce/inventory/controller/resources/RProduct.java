package com.codeonce.inventory.controller.resources;

public class RProduct {

	private String productCode;

	private String productDescription;

	private double productPrice;

	public RProduct(final String productCode, final String productDescription, final double productPrice) {
		super();
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(final String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(final String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(final double productPrice) {
		this.productPrice = productPrice;
	}

}
