package com.codeonce.inventory.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Location {

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "CITY")
	private String city;

	@Column(name = "ADDRESS")
	private String address;

	public Location(final String country, final String city, final String address) {
		super();
		this.country = country;
		this.city = city;
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}
}
