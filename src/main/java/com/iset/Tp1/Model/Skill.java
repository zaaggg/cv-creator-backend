package com.iset.Tp1.Model;

import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSkill;

    @Column(name = "skillTitle")
    private String skillTitle;

    @ManyToOne
    @JoinColumn(name = "idAccount")
    private Account account;

    // Getter and setter methods for all fields

    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(long idSkill) {
        this.idSkill = idSkill;
    }

    public String getSkillTitle() {
        return skillTitle;
    }

    public void setSkillTitle(String skillTitle) {
        this.skillTitle = skillTitle;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
