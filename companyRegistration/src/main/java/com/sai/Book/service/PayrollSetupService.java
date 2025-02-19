package com.sai.Book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sai.Book.DTO.PayrollSetupDTO;
import com.sai.Book.Entity.PayrollSetup;
import com.sai.Book.repository.PayrollSetupRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PayrollSetupService {

    @Autowired
    private PayrollSetupRepository payrollSetupRepository;

    public PayrollSetup savePayrollSetup(PayrollSetupDTO payrollSetupDTO) {
        PayrollSetup payrollSetup = new PayrollSetup();

        // ✅ Check if companyInfo is not null before accessing fields
        if (payrollSetupDTO.getCompanyInfo() != null) {
            payrollSetup.setCompanyName(payrollSetupDTO.getCompanyInfo().getCompanyName());
            payrollSetup.setLegalName(payrollSetupDTO.getCompanyInfo().getLegalName());
            payrollSetup.setFederalId(payrollSetupDTO.getCompanyInfo().getFederalId());
            payrollSetup.setCountry(payrollSetupDTO.getCompanyInfo().getCountry());
            payrollSetup.setState(payrollSetupDTO.getCompanyInfo().getState());
            payrollSetup.setStreetAddress1(payrollSetupDTO.getCompanyInfo().getStreetAddress1());
            payrollSetup.setStreetAddress2(payrollSetupDTO.getCompanyInfo().getStreetAddress2());
            payrollSetup.setCity(payrollSetupDTO.getCompanyInfo().getCity());
            payrollSetup.setZipCode(payrollSetupDTO.getCompanyInfo().getZipCode());
            payrollSetup.setPhone(payrollSetupDTO.getCompanyInfo().getPhone());
            payrollSetup.setFax(payrollSetupDTO.getCompanyInfo().getFax());
            payrollSetup.setEmail(payrollSetupDTO.getCompanyInfo().getEmail());
            payrollSetup.setWebsite(payrollSetupDTO.getCompanyInfo().getWebsite());
            payrollSetup.setTimezone(payrollSetupDTO.getCompanyInfo().getTimezone());
        }

        // ✅ Check if taxInfo is not null
        if (payrollSetupDTO.getTaxInfo() != null) {
            payrollSetup.setFederalEinOption(payrollSetupDTO.getTaxInfo().getFederalEinOption());
            payrollSetup.setFederalEin(payrollSetupDTO.getTaxInfo().getFederalEin());
            payrollSetup.setStateAccountOption(payrollSetupDTO.getTaxInfo().getStateAccountOption());
            payrollSetup.setStateAccountNumber(payrollSetupDTO.getTaxInfo().getStateAccountNumber());
        }

        // ✅ Other fields
        payrollSetup.setIndustryType(payrollSetupDTO.getIndustryType());
        payrollSetup.setFiscalYear(payrollSetupDTO.getFiscalYear());

        // ✅ Check if encryption object is not null
        if (payrollSetupDTO.getEncryption() != null) {
            payrollSetup.setEncryptionEnabled(payrollSetupDTO.getEncryption().isEncryptionEnabled());
            payrollSetup.setCompanyPassword(payrollSetupDTO.getEncryption().getCompanyPassword());
            payrollSetup.setPasswordHint(payrollSetupDTO.getEncryption().getPasswordHint());
        }

        return payrollSetupRepository.save(payrollSetup);
    }
}
