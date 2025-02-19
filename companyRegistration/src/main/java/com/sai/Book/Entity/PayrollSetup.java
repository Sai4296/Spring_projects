package com.sai.Book.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payroll_setup")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayrollSetup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Company Info
    private String companyName;
    private String legalName;
    private String federalId;
    private String country;
    private String state;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String zipCode;
    private String phone;
    private String fax;
    private String email;
    private String website;
    private String timezone;

    // Tax Info
    private String federalEinOption;
    private String federalEin;
    private String stateAccountOption;
    private String stateAccountNumber;

    // Industry & Fiscal Year
    private String industryType;
    private String fiscalYear;

    // Encryption
    private boolean encryptionEnabled;
    private String companyPassword;
    private String confirmPassword;
    private String passwordHint;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getFederalId() {
		return federalId;
	}
	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getFederalEinOption() {
		return federalEinOption;
	}
	public void setFederalEinOption(String federalEinOption) {
		this.federalEinOption = federalEinOption;
	}
	public String getFederalEin() {
		return federalEin;
	}
	public void setFederalEin(String federalEin) {
		this.federalEin = federalEin;
	}
	public String getStateAccountOption() {
		return stateAccountOption;
	}
	public void setStateAccountOption(String stateAccountOption) {
		this.stateAccountOption = stateAccountOption;
	}
	public String getStateAccountNumber() {
		return stateAccountNumber;
	}
	public void setStateAccountNumber(String stateAccountNumber) {
		this.stateAccountNumber = stateAccountNumber;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public boolean isEncryptionEnabled() {
		return encryptionEnabled;
	}
	public void setEncryptionEnabled(boolean encryptionEnabled) {
		this.encryptionEnabled = encryptionEnabled;
	}
	public String getCompanyPassword() {
		return companyPassword;
	}
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getPasswordHint() {
		return passwordHint;
	}
	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}
}