package com.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//aanotations
@Entity
@Table(name="studentss_table")

public class Studentss {
    @Id
    @Column(name="sid")

    private int sid;
    @Column(name="sname",length=20)

    private String sname;
    @Column(name="marks")
    private int marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
