package com.Company.response;

import java.util.List;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;

public class RegistrationResponse {

	Long id;
	Long companyId;
	String legalName;
	String registrationId;
	String dateOfRegister;
	 private CompanyEntity company;
	 AddressEntity address;
	 List<UsersEntity> users;
	

	public RegistrationResponse(Long id, Long companyId, String legalName, String registrationId, String dateOfRegister,
			CompanyEntity company, AddressEntity address, List<UsersEntity> users) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.legalName = legalName;
		this.registrationId = registrationId;
		this.dateOfRegister = dateOfRegister;
		this.company = company;
		this.address = address;
		this.users = users;
	}

	public RegistrationResponse() {
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
	
	public String getLegalName() {
		return legalName;
	}
	
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	
	public String getRegistrationId() {
		return registrationId;
	}
	
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	public String getDateOfRegister() {
		return dateOfRegister;
	}
	
	public void setDateOfRegister(String dateOfRegister) {
		this.dateOfRegister = dateOfRegister;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<UsersEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UsersEntity> users) {
		this.users = users;
	}
	
	
	
}
