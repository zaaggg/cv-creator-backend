package com.iset.Tp1.Controller;

import com.iset.Tp1.Model.Account;
import com.iset.Tp1.Model.CvFile;
import com.iset.Tp1.Repository.CvFileRepository;
import com.iset.Tp1.ServiceImpliment.CvFileServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")

public class CvFileController {


    @Autowired
    private CvFileServiceImp cvFileService;
    @Autowired
    private CvFileRepository cvFileRepo;

    @PostMapping("/CvFile/add")
    public ResponseEntity<CvFile> addCategory(@RequestBody CvFile cvFile){
        this.cvFileService.addCvFile(cvFile);
        return new ResponseEntity<>(cvFile, HttpStatus.CREATED);
    }

    @GetMapping("/CvFiles")
    public ResponseEntity<List<CvFile>> listAllCvFiles(){

        List<CvFile> CvFiles = cvFileService.ListAllCvFiles();
        return new ResponseEntity<>(CvFiles, HttpStatus.OK);
    }

    @GetMapping("/AllCvs/{account}")
    public ResponseEntity<List<String>> getAllCvs(@PathVariable("account") long account){
        return new ResponseEntity<>(cvFileService.listAllCvs(account), HttpStatus.OK);
    }

    @GetMapping("/Cvs/{account}/{skillTitle}")
    public ResponseEntity<List<String>> getCvs(@PathVariable("account") long account, @PathVariable("skillTitle") String skillTitle){
        return new ResponseEntity<>(cvFileService.listCvs(account,skillTitle), HttpStatus.OK);
    }








}
