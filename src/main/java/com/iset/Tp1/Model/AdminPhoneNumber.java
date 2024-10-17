package com.iset.Tp1.Model;
import javax.persistence.*;

@Entity
@Table(name = "AdminPhoneNumber")
public class AdminPhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdminPhoneNumber;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;


    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setIdAdminPhoneNumber(long idAdminPhoneNumber) {
        this.idAdminPhoneNumber = idAdminPhoneNumber;
    }

    public long getIdAdminPhoneNumber() {
        return idAdminPhoneNumber;
    }
}


