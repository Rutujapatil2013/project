package com.Company.request;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class RegistrationRequest {
	
	Long id;
	Long companyId;
	String legalName;
	String registrationId;
	String dateOfRegister;
	CompanyEntity company;
	AddressEntity address;
	List<UsersEntity> users;
	
	
	public Long getId() {
		return id;
	}
	
	public Long getCompanyId() {
		return companyId;
	}
	
	public String getLegalName() {
		return legalName;
	}
	
	public String getRegistrationId() {
		return registrationId;
	}
	
	public String getDateOfRegister() {
		return dateOfRegister;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}


	
	
	
	
	
}
