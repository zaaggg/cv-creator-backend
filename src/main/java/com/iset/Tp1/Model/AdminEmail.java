package com.iset.Tp1.Model;


import javax.persistence.*;

@Entity
@Table(name = "AdminEmail")
public class AdminEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdminEmail;

    @Column(name = "Email")
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setPhoneNumber(String email) {
        Email = email;
    }

    public void setIdAdminPhoneNumber(long idAdminEmail) {
        this.idAdminEmail = idAdminEmail;
    }

    public long getIdAdminPhoneNumber() {
        return idAdminEmail;
    }
}
