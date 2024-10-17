package com.iset.Tp1.Repository;


import com.iset.Tp1.Model.AdminPhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdminPhoneNumberRepository extends JpaRepository<AdminPhoneNumber,Long> {
    @Query("SELECT a.PhoneNumber FROM AdminPhoneNumber a ")
    List<String> getAllPhoneNumbers();
}
