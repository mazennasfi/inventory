package com.codeonce.inventory.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "COMPANYNAME")
	private String companyName;

	@OneToMany(mappedBy = "company")
	private List<User> allUsers;

	@OneToMany(mappedBy = "company")
	private List<Product> allProducts;

	public Company(final String companyName) {
		super();
		this.companyName = companyName;
	}

	public Company() {
		super();
	}

	public String getCompanyName() {
		return companyName;
	}

	public List<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(final List<User> allUsers) {
		this.allUsers = allUsers;
	}

	public List<Product> getAllProducts() {
		return allProducts;
	}

	public void setAllProducts(final List<Product> allProducts) {
		this.allProducts = allProducts;
	}

}
