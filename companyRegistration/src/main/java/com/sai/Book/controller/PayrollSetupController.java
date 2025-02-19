package com.sai.Book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.Book.DTO.PayrollSetupDTO;
import com.sai.Book.Entity.PayrollSetup;
import com.sai.Book.service.PayrollSetupService;

@RestController
@RequestMapping("/api/payrollsetup")
@CrossOrigin(origins = "http://localhost:5173") // ✅ Enable CORS for this controller
public class PayrollSetupController {
    @Autowired private PayrollSetupService parollSetupService;

    @PostMapping("/save")
    public PayrollSetup savePayrollSetup(@RequestBody PayrollSetupDTO payrollSetupDTO) {
        return parollSetupService.savePayrollSetup(payrollSetupDTO);
    }
}
