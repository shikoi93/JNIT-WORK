package com.one2one;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();
        Employee x = new Employee();
        x.setEid(1);
        x.setEname("Shiva");

        Address a = new Address();
        a.setAid(100);
        a.setCity("Irving");
        a.setState("Texas");
        a.setE(x);


        Transaction tx = se.beginTransaction();
        se.save(a);

        tx.commit();
        se.close();
        sf.close();



    }

}






