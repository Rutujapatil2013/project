package com.Company.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address_table")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@OneToOne(mappedBy="address")
	@JsonBackReference
    private CompanyEntity company;
	RegistrationEntity registration;
	List<UsersEntity> users;
	
	@Column(name="companyId")
	 Long companyId;
	
	@Column(name="city")
	String city;
	
	@Column(name="state")
	String state;
	
	@Column(name="country")
	String country;
	
	@Column(name="pincode")
	String pincode;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}


	public RegistrationEntity getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationEntity registration) {
		this.registration = registration;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UsersEntity> users) {
		this.users = users;
	}

	public AddressEntity(Long id, CompanyEntity company, RegistrationEntity registration, List<UsersEntity> users,
			Long companyId, String city, String state, String country, String pincode) {
		super();
		this.id = id;
		this.company = company;
		this.registration = registration;
		this.users = users;
		this.companyId = companyId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
