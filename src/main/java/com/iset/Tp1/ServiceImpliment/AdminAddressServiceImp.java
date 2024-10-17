package com.iset.Tp1.ServiceImpliment;

import com.iset.Tp1.Model.AdminAddress;
import com.iset.Tp1.Repository.AdminAddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminAddressServiceImp {

    @Autowired
    AdminAddressRepository repository;

    public List<AdminAddress> ListAllAddresses() {
        return repository.findAll();
    }
}
