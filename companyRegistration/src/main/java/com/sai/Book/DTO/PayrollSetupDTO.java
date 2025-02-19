package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayrollSetupDTO {

    private CompanyInfo companyInfo;
    private TaxInfo taxInfo;
    private String industryType;
    private String fiscalYear;
    private Encryption encryption;
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
}