package com.Company.response;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class AddressResponse {

	Long id;
	Long companyId;
	String city;
	String state;
	String country;
	String pincode;
	private CompanyEntity company;
	RegistrationEntity registration;
	List<UsersEntity> users;
	

	

	public AddressResponse(Long id, Long companyId, String city, String state, String country, String pincode,
			CompanyEntity company, RegistrationEntity registration, List<UsersEntity> users) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.company = company;
		this.registration = registration;
		this.users = users;
	}

	public AddressResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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

	
	
}
