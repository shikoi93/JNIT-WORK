package com.one2many;

//import java.util.Set;
//import java.util.List;
import java.util.Map;


public class Employee {
    private int id;
    private String ename;
 //   private Set x;
   // private List x;
    private Map x;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getEname() {

        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    //public Set getX() {
   // public List getX(){
    public Map getX(){

        return x;
    }

   // public void setX(Set x) {

   // public void setX(List x) {
    public void setX(Map x){
        this.x = x;
    }
    }

