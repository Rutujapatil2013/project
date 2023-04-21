package com.Company.transformer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Company.entity.AddressEntity;
import com.Company.entity.CompanyEntity;
import com.Company.entity.RegistrationEntity;
import com.Company.entity.UsersEntity;
import com.Company.request.AddressRequest;
import com.Company.request.CompanyRequest;
import com.Company.request.RegistrationRequest;
import com.Company.request.UsersRequest;

@Component
public class RequestConverter {

	public RequestConverter() {
		
	}
	
	//company
	public CompanyEntity toCompanyEntity(final CompanyRequest companyRequest) {
		CompanyEntity companyData = new CompanyEntity();
		companyData.setId(companyRequest.getId());
		companyData.setCompanyId(companyRequest.getCompanyId());
		companyData.setCompanyName(companyRequest.getCompanyName());
		companyData.setPhoneNumber(companyRequest.getPhoneNumber());
		companyData.setIsDeleted(companyRequest.getIsDeleted());
		companyData.setRegistration(companyRequest.getRegistration());
		companyData.setAddress(companyRequest.getAddress());
		companyData.setUsers(companyRequest.getUsers());
		
		if (companyRequest.getRegistration() != null) {
	        RegistrationEntity registrationData = toRegistrationEntityMethod(companyRequest.getRegistration());
	        companyData.setRegistration(registrationData);
	    }
		if (companyRequest.getAddress() != null) {
	        AddressEntity addressData = toAddressEntityMethod(companyRequest.getAddress());
	        companyData.setAddress(addressData);
	    }
		
//		if (companyRequest.getUsers() != null) {
//			List<UsersEntity> usersData = (List<UsersEntity>) toUsersEntityMethod(companyRequest.getUsers());
//	        companyData.setUsers(usersData);
//	    }
		return companyData;
	}

	private RegistrationEntity toRegistrationEntityMethod(RegistrationEntity registration) {
	    RegistrationEntity registrationData = new RegistrationEntity();
	    registrationData.setId(registration.getId());
		registrationData.setCompanyId(registration.getCompanyId());
		registrationData.setLegalName(registration.getLegalName());
		registrationData.setRegistrationId(registration.getRegistrationId());
		registrationData.setDateOfRegister(registration.getDateOfRegister());
		return registrationData;
	}
	
	private AddressEntity toAddressEntityMethod(AddressEntity address) {
		AddressEntity addressData = new AddressEntity();
		addressData.setId(address.getId());
		addressData.setCompanyId(address.getCompanyId());
		addressData.setCity(address.getCity());
		addressData.setState(address.getState());
		addressData.setCountry(address.getCountry());
		addressData.setPincode(address.getPincode());
		return addressData;
	}
	
//	private List<UsersEntity> toUsersEntityList(List<UsersRequest> usersList) {
//	    return usersList.stream().map(this::toUsersEntity).collect(Collectors.toList());
//	}
//	
	private UsersEntity toUsersEntityMethod(UsersEntity users) {
		UsersEntity usersData = new UsersEntity();
	    usersData.setId(users.getId());
		usersData.setCompanyId(users.getCompanyId());
		usersData.setFirstName(users.getFirstName());
		usersData.setLastName(users.getLastName());
		usersData.setType(users.getType());
		usersData.setEmail(users.getEmail());
		return usersData;
	}
	
	
	
	//2
	//Address
	public AddressEntity toAddressEntity(final AddressRequest addressRequest) {
		AddressEntity addressData = new AddressEntity();
		addressData.setId(addressRequest.getId());
		addressData.setCompanyId(addressRequest.getCompanyId());
		addressData.setCity(addressRequest.getCity());
		addressData.setState(addressRequest.getState());
		addressData.setCountry(addressRequest.getCountry());
		addressData.setPincode(addressRequest.getPincode());
		addressData.setCompany(addressRequest.getCompany());
		addressData.setRegistration(addressRequest.getRegistration());
		addressData.setUsers(addressRequest.getUsers());
		
		if (addressRequest.getCompany() != null) {
	        CompanyEntity companyData = toCompanyEntityMethod(addressRequest.getCompany());
	        addressData.setCompany(companyData);
	    }
		return addressData;
	}
	
	private CompanyEntity toCompanyEntityMethod(CompanyEntity company) {
		CompanyEntity companyData = new CompanyEntity();
		companyData.setId(company.getId());
		companyData.setCompanyId(company.getCompanyId());
		companyData.setCompanyName(company.getCompanyName());
		companyData.setPhoneNumber(company.getPhoneNumber());
		companyData.setIsDeleted(company.getIsDeleted());
		return companyData;
	}
	
	
	
	//Registration
	public RegistrationEntity toRegistrationEntity(final RegistrationRequest registrationRequest) {
		RegistrationEntity registrationData = new RegistrationEntity();
		registrationData.setId(registrationRequest.getId());
		registrationData.setCompanyId(registrationRequest.getCompanyId());
		registrationData.setLegalName(registrationRequest.getLegalName());
		registrationData.setRegistrationId(registrationRequest.getRegistrationId());
		registrationData.setDateOfRegister(registrationRequest.getDateOfRegister());
		registrationData.setCompany(registrationRequest.getCompany());
		registrationData.setAddress(registrationRequest.getAddress());
		registrationData.setUsers(registrationRequest.getUsers());
		
		
		if (registrationRequest.getCompany() != null) {
	        CompanyEntity companyData = toCompanyEntityMethod(registrationRequest.getCompany());
	        registrationData.setCompany(companyData);
	    }
		return registrationData;
	}
	
	
	
	//Users
	public UsersEntity toUsersEntity(final UsersRequest usersRequest) {
		UsersEntity usersData = new UsersEntity();
		usersData.setId(usersRequest.getId());
		usersData.setCompanyId(usersRequest.getCompanyId());
		usersData.setFirstName(usersRequest.getFirstName());
		usersData.setLastName(usersRequest.getLastName());
		usersData.setType(usersRequest.getType());
		usersData.setEmail(usersRequest.getEmail());
		return usersData;
	}

}