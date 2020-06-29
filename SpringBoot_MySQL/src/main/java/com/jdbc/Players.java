package com.jdbc;

import org.springframework.stereotype.Component;



import javax.persistence.*;


@Entity
@Table(name = "players")
public class Players {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    @Column(name = "name")
    private String name;
    @Column(name = "speciality")
    private String speciality;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}