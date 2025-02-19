package com.sai.Book.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "setupform")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SetupForm {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "company_name")
	    private String companyName;

	    @Column(name = "legal_name")
	    private String legalName;

	    @Column(name = "federal_id")
	    private String federalId;

	    @Column(name = "country")
	    private String country;

	    @Column(name = "state")
	    private String state;

	    @Column(name = "street_address1")
	    private String streetAddress1;

	    @Column(name = "street_address2")
	    private String streetAddress2;

	    @Column(name = "city")
	    private String city;

	    @Column(name = "zip_code")
	    private String zipCode;

	    @Column(name = "phone")
	    private String phone;

	    @Column(name = "fax")
	    private String fax;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "website")
	    private String website;

	    @Column(name = "timezone")
	    private String timezone;

	    @Column(name = "bill_tracking")
	    private String billTracking;

	    @Column(name = "charge_or_track_tax")
	    private Boolean chargeOrTrackTax;

	    @Column(name = "industry_type")
	    private String industryType;

	    @Column(name = "fiscal_year")
	    private String fiscalYear;

	    // Encryption Details
	    @Column(name = "encryption_enabled")
	    private Boolean encryptionEnabled;

	    @Column(name = "company_password")
	    private String companyPassword;

	    @Column(name = "password_hint")
	    private String passwordHint;

	    // Tax Info
	    @Column(name = "federal_ein_option")
	    private String federalEinOption;

	    @Column(name = "federal_ein")
	    private String federalEin;

	    @Column(name = "state_account_option")
	    private String stateAccountOption;

	    @Column(name = "state_account_number")
	    private String stateAccountNumber;

	    // Terminology
	    @Column(name = "customer_term")
	    private String customerTerm;

	    @Column(name = "vendor_term")
	    private String vendorTerm;

	    // Services & Products
	    @Column(name = "enable_inventory_tracking")
	    private Boolean enableInventoryTracking;

	    @Column(name = "multiple_warehouses")
	    private Boolean multipleWarehouses;

	    @Column(name = "enable_units")
	    private Boolean enableUnits;

	    @Column(name = "inventory_scheme")
	    private String inventoryScheme;

	    @Column(name = "enable_tracking_tax_paid")
	    private Boolean enableTrackingTaxPaid;

	    // Currency
	    @Column(name = "primary_currency")
	    private String primaryCurrency;

	    @Column(name = "is_multi_currency_enabled")
	    private Boolean isMultiCurrencyEnabled;

	    // Accounts (this could be a separate table if required)
	    @Column(name = "accounts_json", columnDefinition = "TEXT")
	    private String accountsJson; // Store accounts as a JSON string if needed

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

		public String getBillTracking() {
			return billTracking;
		}

		public void setBillTracking(String billTracking) {
			this.billTracking = billTracking;
		}

		public Boolean getChargeOrTrackTax() {
			return chargeOrTrackTax;
		}

		public void setChargeOrTrackTax(Boolean chargeOrTrackTax) {
			this.chargeOrTrackTax = chargeOrTrackTax;
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

		public Boolean getEncryptionEnabled() {
			return encryptionEnabled;
		}

		public void setEncryptionEnabled(Boolean encryptionEnabled) {
			this.encryptionEnabled = encryptionEnabled;
		}

		public String getCompanyPassword() {
			return companyPassword;
		}

		public void setCompanyPassword(String companyPassword) {
			this.companyPassword = companyPassword;
		}

		public String getPasswordHint() {
			return passwordHint;
		}

		public void setPasswordHint(String passwordHint) {
			this.passwordHint = passwordHint;
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

		public String getCustomerTerm() {
			return customerTerm;
		}

		public void setCustomerTerm(String customerTerm) {
			this.customerTerm = customerTerm;
		}

		public String getVendorTerm() {
			return vendorTerm;
		}

		public void setVendorTerm(String vendorTerm) {
			this.vendorTerm = vendorTerm;
		}

		public Boolean getEnableInventoryTracking() {
			return enableInventoryTracking;
		}

		public void setEnableInventoryTracking(Boolean enableInventoryTracking) {
			this.enableInventoryTracking = enableInventoryTracking;
		}

		public Boolean getMultipleWarehouses() {
			return multipleWarehouses;
		}

		public void setMultipleWarehouses(Boolean multipleWarehouses) {
			this.multipleWarehouses = multipleWarehouses;
		}

		public Boolean getEnableUnits() {
			return enableUnits;
		}

		public void setEnableUnits(Boolean enableUnits) {
			this.enableUnits = enableUnits;
		}

		public String getInventoryScheme() {
			return inventoryScheme;
		}

		public void setInventoryScheme(String inventoryScheme) {
			this.inventoryScheme = inventoryScheme;
		}

		public Boolean getEnableTrackingTaxPaid() {
			return enableTrackingTaxPaid;
		}

		public void setEnableTrackingTaxPaid(Boolean enableTrackingTaxPaid) {
			this.enableTrackingTaxPaid = enableTrackingTaxPaid;
		}

		public String getPrimaryCurrency() {
			return primaryCurrency;
		}

		public void setPrimaryCurrency(String primaryCurrency) {
			this.primaryCurrency = primaryCurrency;
		}

		public Boolean getIsMultiCurrencyEnabled() {
			return isMultiCurrencyEnabled;
		}

		public void setIsMultiCurrencyEnabled(Boolean isMultiCurrencyEnabled) {
			this.isMultiCurrencyEnabled = isMultiCurrencyEnabled;
		}

		public String getAccountsJson() {
			return accountsJson;
		}

		public void setAccountsJson(String accountsJson) {
			this.accountsJson = accountsJson;
		}

}
