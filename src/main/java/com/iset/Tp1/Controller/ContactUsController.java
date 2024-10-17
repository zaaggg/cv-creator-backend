package com.iset.Tp1.Controller;

import com.iset.Tp1.Model.ContactUs;
import com.iset.Tp1.Repository.ContactUsRepository;
import com.iset.Tp1.ServiceImpliment.ContactUsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ContactUsController {
    @Autowired
    private ContactUsServiceImp contactUsService;
    @Autowired
    private ContactUsRepository ContactUsRepo;

    @PostMapping("/ContactUs/add")
    public ResponseEntity<ContactUs> addContactUs(@RequestBody ContactUs contact){
        this.contactUsService.addContactUs(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

}
