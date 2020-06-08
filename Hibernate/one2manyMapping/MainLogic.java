package com.one2many;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.HashSet;
import java.util.Set;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

        Transaction tx = se.beginTransaction();

        Employee e = new Employee();
        e.setId(101);
        e.setEname("Shiva");

        Company c = new Company();
        c.setCid(100);
        c.setCname("JNIT");

        Company c1 = new Company();
        c1.setCid(99);
        c1.setCname("Baltra");

        Company c2 = new Company();
        c2.setCid(102);
        c2.setCname("Sugar");


        Set x = new HashSet();
        x.add(c);
        x.add(c1);
        x.add(c2);

        e.setX(x);
        se.save(e);
        tx.commit();
        se.close();
        sf.close();



    }

}






