package com.iset.Tp1.ServiceImpliment;

import com.iset.Tp1.Model.CvStyle;
import com.iset.Tp1.Repository.CvStyleRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class CvStyleServiceImp {

    @Autowired
    CvStyleRepository repository;

    public List<String> ListAllTitles(){
        return repository.getAllTitles();

    }

    public List<String> ListAllDescriptions(){
        return repository.getAllDescriptions();

    }

    public List<String> ListAllImages(){
        return repository.getAllImages();
    }
}
