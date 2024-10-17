package com.iset.Tp1.ServiceImpliment;

import com.iset.Tp1.Model.Account;
import com.iset.Tp1.Repository.AccountRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional


public class AccountServiceImp {
    @Autowired
    AccountRepository repository;

    public Account addAccount(Account account){
        return repository.save(account);
    }
    public Account login(String email, String password) {return repository.login(email, password);}

    public boolean testLogin(String email, String password) {
        long x = repository.testLogin(email, password);
        if (x==1){
            return true;
        }else {
            return false;
        }
    }
    public List<Account> ListAllAccounts(){
        return repository.findAll();
    }
    public boolean isCreated(long id){return repository.cvCreated(id)!=0;}

    public String getPdfData(long idAccount){
        return repository.getPdfData(idAccount);

    };



}
