package me.yling.w3challenge.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String degree;
    private String major;
    private String uni;
    private String graduatedate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getGraduatedate() {
        return graduatedate;
    }

    public void setGraduatedate(String graduatedate) {
        this.graduatedate = graduatedate;
    }
}
