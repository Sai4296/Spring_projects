package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxInfo {
    private String federalEinOption;
    private String federalEin;
    private String stateAccountOption;
    private String stateAccountNumber;
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
}
