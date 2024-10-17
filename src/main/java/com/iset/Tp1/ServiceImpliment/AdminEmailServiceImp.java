package com.iset.Tp1.ServiceImpliment;



import com.iset.Tp1.Model.AdminEmail;
import com.iset.Tp1.Repository.AdminEmailRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class AdminEmailServiceImp {

    @Autowired
    AdminEmailRepository repository;

    public List<String> ListAllAdminEmail(){
        return  repository.getAllEmails();
    }
}
