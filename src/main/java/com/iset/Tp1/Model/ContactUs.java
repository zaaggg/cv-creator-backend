package com.iset.Tp1.Model;

import javax.persistence.*;

@Entity
@Table(name = "ContactUs")
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContactUs;

    @Column(name = "Name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    public long getIdContactUs() {
        return idContactUs;
    }

    public void setIdContactUs(long idContactUs) {
        this.idContactUs = idContactUs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
