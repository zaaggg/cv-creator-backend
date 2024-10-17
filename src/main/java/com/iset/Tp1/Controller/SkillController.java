package com.iset.Tp1.Controller;




import com.iset.Tp1.Model.Skill;
import com.iset.Tp1.Repository.SkillRepository;
import com.iset.Tp1.ServiceImpliment.SkillServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class SkillController {
    @Autowired
    private SkillServiceImp skillService;
    @Autowired
    private SkillRepository SkillRepo;

     /*@GetMapping("/Skills")
    public List<Skill> listAllHobbies(){
         return this.skillService.ListAllSkills();
     }*/

    @PostMapping("/Skill/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        this.skillService.addSkill(skill);
        return new ResponseEntity<>(skill, HttpStatus.CREATED);
    }



}
