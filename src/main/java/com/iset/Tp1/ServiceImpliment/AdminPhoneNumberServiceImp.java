package com.iset.Tp1.ServiceImpliment;



import com.iset.Tp1.Model.AdminPhoneNumber;
import com.iset.Tp1.Repository.AdminPhoneNumberRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class AdminPhoneNumberServiceImp {

    @Autowired
    AdminPhoneNumberRepository repository;

    public List<String> ListAllPhoneNumbers(){
        return  repository.getAllPhoneNumbers();
    }
}
