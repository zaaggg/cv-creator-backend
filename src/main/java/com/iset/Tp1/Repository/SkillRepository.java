package com.iset.Tp1.Repository;

import com.iset.Tp1.Model.Skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;



public interface SkillRepository extends JpaRepository<Skill,Long> {

    //@Query("SELECT s FROM Skill s JOIN s.cv c WHERE c.idCv = :idCv")
    //List<Skill> findSkillsByIdCv(@Param("idCv") long idCv);



  //  @Query("SELECT NEW com.iset.Tp1.Modell.Hobby1(s.idSkill, s.skillTitle, c.idCv) FROM Skill s JOIN s.cv c")
    //List<Skill1> findSkills();



}
