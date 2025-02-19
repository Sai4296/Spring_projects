package com.sai.Book.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sai.Book.DTO.SetupFormDTO;
import com.sai.Book.Entity.SetupForm;
import com.sai.Book.repository.SetupFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class SetupFormService {

    @Autowired
    private SetupFormRepository setupFormRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public SetupForm saveSetupForm(SetupFormDTO setupFormDTO) {
        SetupForm setupForm = new SetupForm();

        // ✅ Map Company Info
        if (setupFormDTO.getCompanyInfo() != null) {
            setupForm.setCompanyName(setupFormDTO.getCompanyInfo().getCompanyName());
            setupForm.setLegalName(setupFormDTO.getCompanyInfo().getLegalName());
            setupForm.setFederalId(setupFormDTO.getCompanyInfo().getFederalId());
            setupForm.setCountry(setupFormDTO.getCompanyInfo().getCountry());
            setupForm.setState(setupFormDTO.getCompanyInfo().getState());
            setupForm.setStreetAddress1(setupFormDTO.getCompanyInfo().getStreetAddress1());
            setupForm.setStreetAddress2(setupFormDTO.getCompanyInfo().getStreetAddress2());
            setupForm.setCity(setupFormDTO.getCompanyInfo().getCity());
            setupForm.setZipCode(setupFormDTO.getCompanyInfo().getZipCode());
            setupForm.setPhone(setupFormDTO.getCompanyInfo().getPhone());
            setupForm.setFax(setupFormDTO.getCompanyInfo().getFax());
            setupForm.setEmail(setupFormDTO.getCompanyInfo().getEmail());
            setupForm.setWebsite(setupFormDTO.getCompanyInfo().getWebsite());
            setupForm.setTimezone(setupFormDTO.getCompanyInfo().getTimezone());
        }

        // ✅ Map Tax Info
        if (setupFormDTO.getTaxInfo() != null) {
            setupForm.setFederalEinOption(setupFormDTO.getTaxInfo().getFederalEinOption());
            setupForm.setFederalEin(setupFormDTO.getTaxInfo().getFederalEin());
            setupForm.setStateAccountOption(setupFormDTO.getTaxInfo().getStateAccountOption());
            setupForm.setStateAccountNumber(setupFormDTO.getTaxInfo().getStateAccountNumber());
        }

        // ✅ Map Industry & Fiscal Year
        setupForm.setIndustryType(setupFormDTO.getIndustryType());
        setupForm.setFiscalYear(setupFormDTO.getFiscalYear());

        // ✅ Map Encryption Details
        if (setupFormDTO.getEncryption() != null) {
            setupForm.setEncryptionEnabled(setupFormDTO.getEncryption().isEncryptionEnabled());
            setupForm.setCompanyPassword(setupFormDTO.getEncryption().getCompanyPassword());
            setupForm.setPasswordHint(setupFormDTO.getEncryption().getPasswordHint());
        }

        // ✅ Map Terminology
        if (setupFormDTO.getTerminology() != null) {
            setupForm.setCustomerTerm(setupFormDTO.getTerminology().getCustomerTerm());
            setupForm.setVendorTerm(setupFormDTO.getTerminology().getVendorTerm());
        }

        // ✅ Map Services & Products
        if (setupFormDTO.getServicesProducts() != null) {
            setupForm.setEnableInventoryTracking(setupFormDTO.getServicesProducts().isEnableInventoryTracking());
            setupForm.setMultipleWarehouses(setupFormDTO.getServicesProducts().isMultipleWarehouses());
            setupForm.setEnableUnits(setupFormDTO.getServicesProducts().isEnableUnits());
            setupForm.setInventoryScheme(setupFormDTO.getServicesProducts().getInventoryScheme());
            setupForm.setChargeOrTrackTax(setupFormDTO.getServicesProducts().isChargeOrTrackTax());
            setupForm.setEnableTrackingTaxPaid(setupFormDTO.getServicesProducts().isEnableTrackingTaxPaid());
        }

        // ✅ Map Currency Details
        if (setupFormDTO.getCurrency() != null) {
            setupForm.setPrimaryCurrency(setupFormDTO.getCurrency().getPrimaryCurrency());
            setupForm.setIsMultiCurrencyEnabled(setupFormDTO.getCurrency().isMultiCurrencyEnabled());
        }

        // ✅ Map Bill Tracking
        setupForm.setBillTracking(setupFormDTO.getBillTracking());

        // ✅ Map Accounts (Stored as JSON String)
        try {
            setupForm.setAccountsJson(objectMapper.writeValueAsString(setupFormDTO.getAccounts()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting accountsJson to String", e);
        }

        // ✅ Save to Database
        return setupFormRepository.save(setupForm);
    }
}
