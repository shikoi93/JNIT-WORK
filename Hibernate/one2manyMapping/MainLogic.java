package com.one2many;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();
/*
        Object o = se.get(Employee.class, 101);
        Employee e = (Employee)o;
        System.out.println(e.getId());
        System.out.println(e.getEname());

        Set x = e.getX();
        Iterator li = x.iterator();
        while (li.hasNext()) {
            Object p = (Object)li.next();
            Company c = (Company)p;
            System.out.println(c.getCid()+" "+c.getCname()+" "+c.getFkid());


        }

*/
//set insertion
        //Object o = se.get(Employee.class,100);
       // Employee e =(Employee)o;
//        Transaction tx = se.beginTransaction();
//
//       Employee e = new Employee();
//        e.setId(101);
//        e.setEname("Shiva");
//
//        Company c = new Company();
//        c.setCid(100);
//        c.setCname("JNIT");
//
//        Company c1 = new Company();
//        c1.setCid(99);
//        c1.setCname("Baltra");
//
//        Company c2 = new Company();
//        c2.setCid(102);
//        c2.setCname("Sugar");
//
//
//        Set x = new HashSet();
//        x.add(c);
//        x.add(c1);
//        x.add(c2);
//
//        e.setX(x);
//        se.save(e);
//        //se.delete(e);
//        //tx.commit();
//        se.close();
//        sf.close();

   //List insertion
//        Transaction tx = se.beginTransaction();
//        Employee e = new Employee();
//        e.setId(101);
//        e.setEname("Shiva");
//
//        Company c = new Company();
//        c.setCid(100);
//        c.setCname("JNIT");
//
//        Company c1 = new Company();
//        c1.setCid(99);
//        c1.setCname("Baltra");
//
//        Company c2 = new Company();
//        c2.setCid(102);
//        c2.setCname("Sugar");
//
//        List l = new ArrayList();
//        l.add(c);
//        l.add(c1);
//        l.add(c2);
//        e.setX(l);
//        se.save(e);

//Map Insertion
//        Transaction tx = se.beginTransaction();
//        Employee e = new Employee();
//        e.setId(101);
//        e.setEname("Shiva");
//
//        Company c = new Company();
//        c.setCid(99);
//        c.setCname("JNIT");
//
//        Company c1 = new Company();
//        c1.setCid(100);
//        c1.setCname("Baltra");
//
//        Company c2 = new Company();
//        c2.setCid(102);
//        c2.setCname("Sugar");
//
//        Map hm = new HashMap();
//        hm.put("company1", c);
//        hm.put("company2", c1);
//        hm.put("company3", c2);
//
//        e.setX(hm);
//        se.delete(e);
//
//        //se.save(e);
//        tx.commit();
        se.close();
        sf.close();


    }

}






