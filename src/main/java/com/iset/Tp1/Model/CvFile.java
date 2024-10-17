package com.iset.Tp1.Model;

import javax.persistence.*;

@Entity
@Table(name = "cvFile")
public class CvFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCvFile;
    
    @Column(name = "photo")
    private String photoData;

    @Column(name = "pdf")
    private String pdfData;
    @OneToOne
    @JoinColumn(name = "idAccount")
    private Account account;

    // Getter and setter methods for all fields

    public long getIdCvFile() {
        return idCvFile;
    }

    public void setIdCvFile(long idCvFile) {
        this.idCvFile = idCvFile;
    }


    public String getPhotoData() {
        return photoData;
    }

    public void setPhotoData(String photoData) {
        this.photoData = photoData;
    }

    public String getPdfData() {
        return pdfData;
    }

    public void setPdfData(String pdfData) {
        this.pdfData = pdfData;
    }

    public Account getAccountId() {
        return account;
    }

    public void setAccountId(Account account) {
        this.account = account;
    }
}