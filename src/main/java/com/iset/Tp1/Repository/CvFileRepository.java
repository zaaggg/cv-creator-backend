package com.iset.Tp1.Repository;

import com.iset.Tp1.Model.Account;
import com.iset.Tp1.Model.CvFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CvFileRepository extends JpaRepository<CvFile,Long>  {
    @Query("SELECT c.photoData FROM CvFile c join c.account a where a.idAccount <> :account")
    List<String> getAllCvs(@Param("account") long account);

    @Query("SELECT c.photoData FROM CvFile c join c.account a , Skill s  where a.idAccount <> :account  and s.account=c.account and s.skillTitle= :skillTitle")
    List<String> getCvs(@Param("account") long account,@Param("skillTitle") String skillTitle);
}
