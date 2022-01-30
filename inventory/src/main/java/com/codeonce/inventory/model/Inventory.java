package com.codeonce.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY")
public class Inventory extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "COUNT")
	private Double count;

	@Column(name = "INVENTORYCODE")
	private String inventoryCode;

	@Column(name = "PRODUCTID")
	private String productId;

	public Inventory(final String inventoryCode) {
		super();
		this.inventoryCode = inventoryCode;
	}

	public Inventory() {
		super();
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public Double getCount() {
		return count;
	}

	public void setCount(final Double count) {
		this.count = count;
	}

	public void addToInventory(final Double addedValue) {
		this.count += addedValue;
	}

	public void subFromInventory(final Double addedValue) {
		this.count -= addedValue;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

}
