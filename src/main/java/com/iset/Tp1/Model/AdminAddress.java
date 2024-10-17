package com.iset.Tp1.Model;

import javax.persistence.*;

@Entity
@Table(name = "AdminAddress")
public class AdminAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAdminEmail;

    @Column(name = "Governorate")
    private String governorate;

    @Column(name = "PostCode")
    private String postCode;

    @Column(name = "City")
    private String city;

    @Column(name = "Email")
    private String email;

    @Column(name = "Street")
    private String street;

    public long getIdAdminEmail() {
        return idAdminEmail;
    }

    public void setIdAdminEmail(long idAdminEmail) {
        this.idAdminEmail = idAdminEmail;
    }

    public String getGovernorate() {
        return governorate;
    }

    public void setGovernorate(String governorate) {
        this.governorate = governorate;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
