package com.many2many;

import java.util.Set;

public class Course {
    private int cid;
    private String cname;
    private int duration;
    private Set s;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set getS() {
        return s;
    }

    public void setS(Set s) {
        this.s = s;
    }
}