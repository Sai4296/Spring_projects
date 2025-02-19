package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terminology {
    private String customerTerm;
    private String vendorTerm;
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
}
