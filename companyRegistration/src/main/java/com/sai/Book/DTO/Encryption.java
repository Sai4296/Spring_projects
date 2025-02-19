package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Encryption {
    private boolean encryptionEnabled;
    private String companyPassword;
    private String confirmPassword;
    private String passwordHint;
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
