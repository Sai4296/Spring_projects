package com.sai.Book.DTO;

import lombok.*;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SetupFormDTO {
    
	    private CompanyInfo companyInfo;
	    private TaxInfo taxInfo;
	    private String industryType;
	    private String fiscalYear;
	    private Encryption encryption;
	    private Terminology terminology;
	    private ServicesProducts servicesProducts;
	    private String estimatesStatements;
	    private Currency currency;
	    private String billTracking;
	    private Map<String, Boolean> accounts;
		public CompanyInfo getCompanyInfo() {
			return companyInfo;
		}
		public void setCompanyInfo(CompanyInfo companyInfo) {
			this.companyInfo = companyInfo;
		}
		public TaxInfo getTaxInfo() {
			return taxInfo;
		}
		public void setTaxInfo(TaxInfo taxInfo) {
			this.taxInfo = taxInfo;
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
		public Encryption getEncryption() {
			return encryption;
		}
		public void setEncryption(Encryption encryption) {
			this.encryption = encryption;
		}
		public Terminology getTerminology() {
			return terminology;
		}
		public void setTerminology(Terminology terminology) {
			this.terminology = terminology;
		}
		public ServicesProducts getServicesProducts() {
			return servicesProducts;
		}
		public void setServicesProducts(ServicesProducts servicesProducts) {
			this.servicesProducts = servicesProducts;
		}
		public String getEstimatesStatements() {
			return estimatesStatements;
		}
		public void setEstimatesStatements(String estimatesStatements) {
			this.estimatesStatements = estimatesStatements;
		}
		public Currency getCurrency() {
			return currency;
		}
		public void setCurrency(Currency currency) {
			this.currency = currency;
		}
		public String getBillTracking() {
			return billTracking;
		}
		public void setBillTracking(String billTracking) {
			this.billTracking = billTracking;
		}
		public Map<String, Boolean> getAccounts() {
			return accounts;
		}
		public void setAccounts(Map<String, Boolean> accounts) {
			this.accounts = accounts;
		}
}