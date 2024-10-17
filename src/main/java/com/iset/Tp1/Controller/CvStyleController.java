package com.iset.Tp1.Controller;


import com.iset.Tp1.Model.CvStyle;

import com.iset.Tp1.Repository.CvStyleRepository;

import com.iset.Tp1.ServiceImpliment.CvStyleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class CvStyleController {
    @Autowired
    private CvStyleRepository CvStyleRepo;

    @Autowired
    private CvStyleServiceImp cvStyleService;

    @GetMapping("/CvStyle/Descriptions")
    public List<String> listAllDescriptions(){
        return this.cvStyleService.ListAllDescriptions();
    }

    @GetMapping("/CvStyle/Titles")
    public List<String> listAllTitles(){
        return this.cvStyleService.ListAllTitles();
    }

    @GetMapping("/CvStyle/Images")
    public List<String> listAllImages(){
        return this.cvStyleService.ListAllImages();
    }

}
