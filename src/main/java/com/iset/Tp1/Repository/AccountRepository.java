package com.iset.Tp1.Repository;

import com.iset.Tp1.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRepository  extends JpaRepository<Account,Long>  {
    @Query("SELECT a FROM Account a WHERE a.email = :email and a.password = :password")
    Account login(@Param("email") String email, @Param("password") String password);

    @Query("SELECT count(a) FROM Account a WHERE a.email = :email and a.password = :password")
    long testLogin(@Param("email") String email, @Param("password") String password);
    @Query("SELECT a.email FROM Account a ")
    String[] listEmail();

    @Query("SELECT count(c) FROM CvFile  c join c.account a  where  a.idAccount= :idAccount")
    long cvCreated(@Param("idAccount") long idAccount);

    @Query("SELECT c.pdfData FROM CvFile c join c.account a where a.idAccount = : idAccount")
    String getPdfData(@Param("idAccount") long idAccount);

}
