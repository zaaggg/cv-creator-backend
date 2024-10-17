package com.iset.Tp1.ServiceImpliment;



import com.iset.Tp1.Model.ContactUs;
import com.iset.Tp1.Repository.ContactUsRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class ContactUsServiceImp {

    @Autowired
    ContactUsRepository repository;

    public ContactUs addContactUs(ContactUs contactUs){
        return repository.save(contactUs);
    }
}
