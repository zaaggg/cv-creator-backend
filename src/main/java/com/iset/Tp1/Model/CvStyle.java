package com.iset.Tp1.Model;

import javax.persistence.*;

@Entity
@Table(name = "CvStyle")
public class CvStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCvStyle;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    public long getIdCvStyle() {
        return idCvStyle;
    }

    public void setIdCvStyle(long idCvStyle) {
        this.idCvStyle = idCvStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

