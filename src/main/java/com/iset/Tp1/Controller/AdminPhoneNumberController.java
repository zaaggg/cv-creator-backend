package com.iset.Tp1.Controller;

import com.iset.Tp1.Model.AdminPhoneNumber;

import com.iset.Tp1.Repository.AdminPhoneNumberRepository;
import com.iset.Tp1.ServiceImpliment.AdminPhoneNumberServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class AdminPhoneNumberController {
    @Autowired
    private AdminPhoneNumberServiceImp adminPhoneNumberService;
    @Autowired
    private AdminPhoneNumberRepository AdminPhoneNumberRepo;

    @GetMapping("/PhoneNumbers")
    public List<String> listAllAllPhoneNumbers(){
        return this.adminPhoneNumberService.ListAllPhoneNumbers();
    }

}
