package com.iset.Tp1.Repository;

import com.iset.Tp1.Model.CvStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CvStyleRepository extends JpaRepository<CvStyle,Long> {

    @Query("SELECT c.title FROM CvStyle c ")
    List<String> getAllTitles();

    @Query("SELECT c.image FROM CvStyle c ")
    List<String> getAllImages();

    @Query("SELECT c.description FROM CvStyle c ")
    List<String> getAllDescriptions();


}
