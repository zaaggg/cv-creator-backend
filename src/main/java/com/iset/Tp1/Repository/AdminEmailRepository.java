package com.iset.Tp1.Repository;


import com.iset.Tp1.Model.AdminEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdminEmailRepository extends JpaRepository<AdminEmail,Long> {
    @Query("SELECT a.Email FROM AdminEmail a ")
    List<String> getAllEmails();
}
