package com.prabhu.primarykey;

import javax.persistence.*;

@Entity
@Table(name="address_batch37")
public class Address {

	@Id
	@Column(name="address_id")
	private long id;
	@Column(name="street")
	private String street;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address=[street= "+street+", city= "+city+", country= "+country+" ]";
	}
	
}
