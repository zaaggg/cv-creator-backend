package com.iset.Tp1.Controller;

import com.iset.Tp1.Model.AdminEmail;

import com.iset.Tp1.Repository.AdminEmailRepository;
import com.iset.Tp1.ServiceImpliment.AdminEmailServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class AdminEmailController {
    @Autowired
    private AdminEmailServiceImp adminEmailService;
    @Autowired
    private AdminEmailRepository AdminEmailRepo;

    @GetMapping("/AdminEmails")
    public List<String> listAllAdminEmails(){
        return this.adminEmailService.ListAllAdminEmail();
    }

}
