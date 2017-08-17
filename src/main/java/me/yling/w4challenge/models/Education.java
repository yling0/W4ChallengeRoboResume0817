package me.yling.w4challenge.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Education
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 2)
    private String degree;
    @NotNull
    @Size(min = 2)
    private String major;
    @NotNull
    @Size(min = 2)
    private String uni;
    @NotNull
    @Size(min = 2)
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
