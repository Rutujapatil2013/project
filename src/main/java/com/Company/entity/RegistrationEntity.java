package com.Company.entity;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="registration_table")
public class RegistrationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="companyId")
	 Long companyId;
	
	@Column(name="legalName")
	String legalName;
	
	@Column(name="registrationId")
	String registrationId;
	
	@Column(name="dateOfRegister")
	String dateOfRegister;
	
//	@JdbcTypeCode(SqlTypes.JSON)
	@JsonBackReference
	@OneToOne(mappedBy="registration")
    private CompanyEntity company;
	AddressEntity address;
	List<UsersEntity> users;
	
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

	public RegistrationEntity(Long id, Long companyId, String legalName, String registrationId, String dateOfRegister,
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

	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}