package com.Company.request;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class AddressRequest {
	
	Long id;
	Long companyId;
	String city;
	String state;
	String country;
	String pincode;
	CompanyEntity company;
	RegistrationEntity registration;
	List<UsersEntity> users;

	public Long getId() {
		return id;
	}
	
	public Long getCompanyId() {
		return companyId;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getPincode() {
		return pincode;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public RegistrationEntity getRegistration() {
		return registration;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}

	
	
}
