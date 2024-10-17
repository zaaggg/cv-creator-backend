package com.iset.Tp1.ServiceImpliment;

import com.iset.Tp1.Model.Skill;
import com.iset.Tp1.Repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class SkillServiceImp {
    @Autowired
    SkillRepository repository;

    public Skill addSkill(Skill skill){
        return repository.save(skill);
    }


    /*public List<Skill> ListAllSkills(){
        return repository.findAll();
    }*/
}
