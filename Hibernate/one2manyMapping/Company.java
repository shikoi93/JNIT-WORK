package com.one2many;

public class Company {
    private int cid;
    private String cname;
    private int fkid;

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

    public int getFkid() {

        return fkid;
    }

    public void setFkid(int fkid) {

        this.fkid = fkid;
    }
}
