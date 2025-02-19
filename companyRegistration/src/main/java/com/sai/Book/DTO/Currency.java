package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Currency {
    private String primaryCurrency;
    private boolean isMultiCurrencyEnabled;
	public String getPrimaryCurrency() {
		return primaryCurrency;
	}
	public void setPrimaryCurrency(String primaryCurrency) {
		this.primaryCurrency = primaryCurrency;
	}
	public boolean isMultiCurrencyEnabled() {
		return isMultiCurrencyEnabled;
	}
	public void setMultiCurrencyEnabled(boolean isMultiCurrencyEnabled) {
		this.isMultiCurrencyEnabled = isMultiCurrencyEnabled;
	}
}
