package com.iset.Tp1.Repository;

import com.iset.Tp1.Model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ContactUsRepository extends JpaRepository<ContactUs,Long> {
}
