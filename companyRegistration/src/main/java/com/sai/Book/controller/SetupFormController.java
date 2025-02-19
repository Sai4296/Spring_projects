package com.sai.Book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.Book.DTO.SetupFormDTO;
import com.sai.Book.Entity.SetupForm;
import com.sai.Book.service.SetupFormService;

@RestController
@RequestMapping("/api/setupform")
@CrossOrigin(origins = "http://localhost:5173") // ✅ Enable CORS for this controller
public class SetupFormController {
    @Autowired 
    private SetupFormService setupFormService;

    @PostMapping("/save")
    public SetupForm saveSetupForm(@RequestBody SetupFormDTO setupFormDTO) {
            SetupForm savedForm = setupFormService.saveSetupForm(setupFormDTO);
            return setupFormService.saveSetupForm(setupFormDTO);
    }
}