package com.iset.Tp1.ServiceImpliment;

import com.iset.Tp1.Model.Account;
import com.iset.Tp1.Model.CvFile;
import com.iset.Tp1.Repository.CvFileRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class CvFileServiceImp {
    private final CvFileRepository repository;

    public CvFile addCvFile(CvFile cvFile){
        return repository.save(cvFile);
    }


    public CvFileServiceImp(CvFileRepository repository) {
        this.repository = repository;
    }
    public List<CvFile> ListAllCvFiles(){
        return repository.findAll();
    }

    public List<String> listAllCvs(long account){
        return repository.getAllCvs(account);
    }

    public List<String> listCvs(long account,String skillTitle){
        return repository.getCvs(account,skillTitle);
    }

}
